package o9;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.Log;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes3.dex */
public final class m implements GLSurfaceView.Renderer {

    /* renamed from: j, reason: collision with root package name */
    public static final String[] f23235j = {"y_tex", "u_tex", "v_tex"};

    /* renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f23236k = com.bumptech.glide.c.p(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

    /* renamed from: b, reason: collision with root package name */
    public final GLSurfaceView f23237b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f23238c = new int[3];

    /* renamed from: d, reason: collision with root package name */
    public final int[] f23239d = new int[3];

    /* renamed from: f, reason: collision with root package name */
    public final int[] f23240f = new int[3];

    /* renamed from: g, reason: collision with root package name */
    public final int[] f23241g = new int[3];

    /* renamed from: h, reason: collision with root package name */
    public final AtomicReference f23242h = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public n9.h f23243i;

    public m(GLSurfaceView gLSurfaceView) {
        this.f23237b = gLSurfaceView;
        for (int i10 = 0; i10 < 3; i10++) {
            int[] iArr = this.f23240f;
            this.f23241g[i10] = -1;
            iArr[i10] = -1;
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        a4.j.t(this.f23242h.getAndSet(null));
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.f23239d;
        try {
            n9.h hVar = new n9.h("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f23243i = hVar;
            GLES20.glVertexAttribPointer(hVar.c("in_pos"), 2, 5126, false, 0, (Buffer) f23236k);
            iArr[0] = this.f23243i.c("in_tc_y");
            iArr[1] = this.f23243i.c("in_tc_u");
            iArr[2] = this.f23243i.c("in_tc_v");
            GLES20.glGetUniformLocation(this.f23243i.f22539b, "mColorConversion");
            com.bumptech.glide.c.j();
            int[] iArr2 = this.f23238c;
            try {
                GLES20.glGenTextures(3, iArr2, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    n9.h hVar2 = this.f23243i;
                    GLES20.glUniform1i(GLES20.glGetUniformLocation(hVar2.f22539b, f23235j[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    com.bumptech.glide.c.d(3553, iArr2[i10]);
                }
                com.bumptech.glide.c.j();
            } catch (n9.i e2) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e2);
            }
            com.bumptech.glide.c.j();
        } catch (n9.i e10) {
            Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
        }
    }
}
