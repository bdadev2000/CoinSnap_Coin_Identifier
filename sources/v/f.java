package v;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.content.res.AppCompatResources;

/* loaded from: classes3.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final q.c f31377a = new q.c();

    public static final boolean a(q.j jVar) {
        int ordinal = jVar.f31297i.ordinal();
        if (ordinal == 0) {
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new RuntimeException();
            }
            if (jVar.L.f31252b != null || !(jVar.B instanceof r.c)) {
                return false;
            }
        }
        return true;
    }

    public static final Drawable b(q.j jVar, Drawable drawable, Integer num, Drawable drawable2) {
        if (drawable != null) {
            return drawable;
        }
        if (num == null) {
            return drawable2;
        }
        if (num.intValue() == 0) {
            return null;
        }
        Context context = jVar.f31291a;
        int intValue = num.intValue();
        Drawable a2 = AppCompatResources.a(context, intValue);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalStateException(android.support.v4.media.d.i("Invalid resource ID: ", intValue).toString());
    }
}
