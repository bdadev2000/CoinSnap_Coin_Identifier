package L1;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: classes.dex */
public final class d extends ByteArrayOutputStream {
    public final /* synthetic */ e b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, int i9) {
        super(i9);
        this.b = eVar;
    }

    @Override // java.io.ByteArrayOutputStream
    public final String toString() {
        int i9 = ((ByteArrayOutputStream) this).count;
        if (i9 > 0 && ((ByteArrayOutputStream) this).buf[i9 - 1] == 13) {
            i9--;
        }
        try {
            return new String(((ByteArrayOutputStream) this).buf, 0, i9, this.b.f1704c.name());
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }
}
