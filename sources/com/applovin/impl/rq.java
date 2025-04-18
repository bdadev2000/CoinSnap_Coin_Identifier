package com.applovin.impl;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* loaded from: classes2.dex */
public final class rq extends GLSurfaceView implements tq {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f26365b = 0;

    /* renamed from: a, reason: collision with root package name */
    private final a f26366a;

    public rq(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f30048a, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Deprecated
    public tq getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void setOutputBuffer(sq sqVar) {
        this.f26366a.a(sqVar);
    }

    /* loaded from: classes2.dex */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: j, reason: collision with root package name */
        private static final float[] f26367j = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: k, reason: collision with root package name */
        private static final float[] f26368k = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: l, reason: collision with root package name */
        private static final float[] f26369l = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: m, reason: collision with root package name */
        private static final String[] f26370m = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: n, reason: collision with root package name */
        private static final FloatBuffer f26371n = ba.a(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a, reason: collision with root package name */
        private final GLSurfaceView f26372a;

        /* renamed from: b, reason: collision with root package name */
        private final int[] f26373b = new int[3];

        /* renamed from: c, reason: collision with root package name */
        private final int[] f26374c = new int[3];
        private final int[] d = new int[3];
        private final int[] e = new int[3];

        /* renamed from: f, reason: collision with root package name */
        private final AtomicReference f26375f = new AtomicReference();

        /* renamed from: g, reason: collision with root package name */
        private final FloatBuffer[] f26376g = new FloatBuffer[3];

        /* renamed from: h, reason: collision with root package name */
        private int f26377h;

        /* renamed from: i, reason: collision with root package name */
        private int f26378i;

        public a(GLSurfaceView gLSurfaceView) {
            this.f26372a = gLSurfaceView;
            for (int i2 = 0; i2 < 3; i2++) {
                int[] iArr = this.d;
                this.e[i2] = -1;
                iArr[i2] = -1;
            }
        }

        public void a(sq sqVar) {
            d8.a(this.f26375f.getAndSet(sqVar));
            this.f26372a.requestRender();
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onDrawFrame(GL10 gl10) {
            d8.a(this.f26375f.getAndSet(null));
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceChanged(GL10 gl10, int i2, int i3) {
            GLES20.glViewport(0, 0, i2, i3);
        }

        @Override // android.opengl.GLSurfaceView.Renderer
        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            int a2 = ba.a("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.f26377h = a2;
            GLES20.glUseProgram(a2);
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f26377h, "in_pos");
            GLES20.glEnableVertexAttribArray(glGetAttribLocation);
            GLES20.glVertexAttribPointer(glGetAttribLocation, 2, 5126, false, 0, (Buffer) f26371n);
            this.f26374c[0] = GLES20.glGetAttribLocation(this.f26377h, "in_tc_y");
            GLES20.glEnableVertexAttribArray(this.f26374c[0]);
            this.f26374c[1] = GLES20.glGetAttribLocation(this.f26377h, "in_tc_u");
            GLES20.glEnableVertexAttribArray(this.f26374c[1]);
            this.f26374c[2] = GLES20.glGetAttribLocation(this.f26377h, "in_tc_v");
            GLES20.glEnableVertexAttribArray(this.f26374c[2]);
            ba.a();
            this.f26378i = GLES20.glGetUniformLocation(this.f26377h, "mColorConversion");
            ba.a();
            a();
            ba.a();
        }

        private void a() {
            GLES20.glGenTextures(3, this.f26373b, 0);
            for (int i2 = 0; i2 < 3; i2++) {
                GLES20.glUniform1i(GLES20.glGetUniformLocation(this.f26377h, f26370m[i2]), i2);
                GLES20.glActiveTexture(33984 + i2);
                GLES20.glBindTexture(3553, this.f26373b[i2]);
                GLES20.glTexParameterf(3553, 10241, 9729.0f);
                GLES20.glTexParameterf(3553, 10240, 9729.0f);
                GLES20.glTexParameterf(3553, 10242, 33071.0f);
                GLES20.glTexParameterf(3553, 10243, 33071.0f);
            }
            ba.a();
        }
    }

    public rq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f26366a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}
