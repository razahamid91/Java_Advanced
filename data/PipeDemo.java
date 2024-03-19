package data;

import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeDemo {
    public static void main(String[] args) throws Exception {

        Pipe p = Pipe.open();
        Pipe.SinkChannel ps = p.sink();
        String str = "Computer";

        ByteBuffer bb = ByteBuffer.allocate(1024);
        bb.clear();
        bb.put(str.getBytes());
        bb.flip();
        while (bb.hasRemaining())

            ps.write(bb);

        Pipe.SourceChannel source = p.source();
        bb = ByteBuffer.allocate(1024);

        while (source.read(bb) > 0) {

            char t = (char) bb.get();
            System.out.println(t);
        }
        bb.clear();
    }

}
