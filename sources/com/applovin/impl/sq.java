package com.applovin.impl;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes.dex */
public final class sq extends GLSurfaceView implements uq {
    public static final /* synthetic */ int b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final a f11235a;

    public sq(Context context) {
        this(context, null);
    }

    @Deprecated
    public uq getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(tq tqVar) {
        this.f11235a.a(tqVar);
    }

    public sq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f11235a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }

    /* loaded from: classes.dex */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: j, reason: collision with root package name */
        private static final float[] f11236j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: k, reason: collision with root package name */
        private static final float[] f11237k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
        private static final float[] l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};
        private static final String[] m = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: n, reason: collision with root package name */
        private static final FloatBuffer f11238n = z9.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f11239a;
        private final int[] b = new int[3];

        /* renamed from: c, reason: collision with root package name */
        private final int[] f11240c = new int[3];

        /* renamed from: d, reason: collision with root package name */
        private final int[] f11241d = new int[3];

        /* renamed from: e, reason: collision with root package name */
        private final int[] f11242e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        private final AtomicReference f11243f = new AtomicReference();

        /* renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f11244g = new FloatBuffer[3];

        /* renamed from: h, reason: collision with root package name */
        private int f11245h;

        /* renamed from: i, reason: collision with root package name */
        private int f11246i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f11239a = gLSurfaceView;
            for (int i9 = 0; i9 < 3; i9++) {
                int[] iArr = this.f11241d;
                this.f11242e[i9] = -1;
                iArr[i9] = -1;
            }
        }

        public void a(tq tqVar) {
            b8.a(this.f11243f.getAndSet(tqVar));
            this.f11239a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            b8.a(this.f11243f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i9, int i10) {
            GLES20.glViewport(0, 0, i9, i10);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int a6 = z9.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f11245h = a6;
            GLES20.glUseProgram(a6);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11245h, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f11238n);
            this.f11240c[0] = GLES20.glGetAttribLocation(this.f11245h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f11240c[0]);
            this.f11240c[1] = GLES20.glGetAttribLocation(this.f11245h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f11240c[1]);
            this.f11240c[2] = GLES20.glGetAttribLocation(this.f11245h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f11240c[2]);
            z9.a();
            this.f11246i = GLES20.glGetUniformLocation(this.f11245h, "mColorConversion");
            z9.a();
            a();
            z9.a();
        }

        private void a() {
            GLES20.glGenTextures(3, this.b, 0);
            for (int i9 = 0; i9 < 3; i9++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f11245h, m[i9]), i9);
                GLES20.glActiveTexture(33984 + i9);
                GLES20.glBindTexture(3553, this.b[i9]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            z9.a();
        }
    }
}
