package j0;

import android.os.Bundle;
import android.util.Size;
import android.util.SizeF;
import kotlin.jvm.JvmStatic;

/* loaded from: classes.dex */
public abstract class c {
    @JvmStatic
    public static final void a(Bundle bundle, String str, Size size) {
        bundle.putSize(str, size);
    }

    @JvmStatic
    public static final void b(Bundle bundle, String str, SizeF sizeF) {
        bundle.putSizeF(str, sizeF);
    }
}
