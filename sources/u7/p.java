package u7;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes3.dex */
public interface p {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    n a(n nVar);

    void flush();

    ByteBuffer getOutput();

    boolean isActive();

    boolean isEnded();

    void queueEndOfStream();

    void queueInput(ByteBuffer byteBuffer);

    void reset();
}
