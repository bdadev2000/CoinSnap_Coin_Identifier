package z1;

import android.database.Cursor;
import android.os.CancellationSignal;
import java.io.Closeable;
import java.util.List;

/* loaded from: classes.dex */
public interface a extends Closeable {
    void A();

    List B();

    void C(String str);

    void F();

    void G(String str, Object[] objArr);

    void H();

    Cursor I(i iVar, CancellationSignal cancellationSignal);

    void J();

    Cursor K(i iVar);

    j N(String str);

    Cursor O(String str);

    boolean Q();

    boolean R();

    boolean isOpen();

    String z();
}
