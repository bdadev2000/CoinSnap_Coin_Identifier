package u2;

import android.opengl.GLES20;
import android.util.Log;
import com.google.ar.core.Coordinates2d;
import com.google.ar.core.Frame;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import v2.AbstractC2847a;

/* renamed from: u2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2749a {

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f23067h = {-1.0f, -1.0f, 0.0f, -1.0f, 1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f23068i = {0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f};

    /* renamed from: a, reason: collision with root package name */
    public FloatBuffer f23069a;
    public FloatBuffer b;

    /* renamed from: c, reason: collision with root package name */
    public FloatBuffer f23070c;

    /* renamed from: d, reason: collision with root package name */
    public int f23071d;

    /* renamed from: e, reason: collision with root package name */
    public int f23072e;

    /* renamed from: f, reason: collision with root package name */
    public int f23073f;

    /* renamed from: g, reason: collision with root package name */
    public int f23074g;

    public final void a(Frame frame) {
        if (frame.hasDisplayGeometryChanged()) {
            Log.e("backGroundRender发生改变frame.hasDisplayGeometryChanged()", frame.hasDisplayGeometryChanged() + "");
            frame.transformCoordinates2d(Coordinates2d.VIEW_NORMALIZED, this.b, Coordinates2d.TEXTURE_NORMALIZED, this.f23070c);
        }
        if (frame.getTimestamp() == 0) {
            return;
        }
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glBindTexture(36197, this.f23074g);
        GLES20.glUseProgram(this.f23071d);
        GLES20.glVertexAttribPointer(this.f23072e, 3, 5126, false, 0, (Buffer) this.f23069a);
        GLES20.glVertexAttribPointer(this.f23073f, 2, 5126, false, 0, (Buffer) this.f23070c);
        GLES20.glEnableVertexAttribArray(this.f23072e);
        GLES20.glEnableVertexAttribArray(this.f23073f);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f23072e);
        GLES20.glDisableVertexAttribArray(this.f23073f);
        GLES20.glDepthMask(true);
        GLES20.glEnable(2929);
        AbstractC2847a.a("a", "Draw");
    }
}
