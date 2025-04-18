package cf;

import a6.k;
import android.opengl.GLES20;
import bf.c;
import df.f;
import java.nio.FloatBuffer;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class b extends a {

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f2793h = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    /* renamed from: g, reason: collision with root package name */
    public final FloatBuffer f2794g;

    public b() {
        FloatBuffer t5 = k.t(8);
        t5.put(f2793h);
        t5.clear();
        Unit unit = Unit.INSTANCE;
        this.f2794g = t5;
    }

    public final void d() {
        c.b("glDrawArrays start");
        GLES20.glDrawArrays(f.f17021b, 0, e().limit() / c());
        c.b("glDrawArrays end");
    }

    public final FloatBuffer e() {
        return this.f2794g;
    }
}
