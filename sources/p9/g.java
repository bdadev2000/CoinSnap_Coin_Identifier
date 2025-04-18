package p9;

import android.opengl.GLES20;
import android.util.Log;

/* loaded from: classes3.dex */
public final class g {

    /* renamed from: i, reason: collision with root package name */
    public static final float[] f23508i = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f23509j = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final float[] f23510k = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public androidx.activity.result.i f23511b;

    /* renamed from: c, reason: collision with root package name */
    public n9.h f23512c;

    /* renamed from: d, reason: collision with root package name */
    public int f23513d;

    /* renamed from: e, reason: collision with root package name */
    public int f23514e;

    /* renamed from: f, reason: collision with root package name */
    public int f23515f;

    /* renamed from: g, reason: collision with root package name */
    public int f23516g;

    /* renamed from: h, reason: collision with root package name */
    public int f23517h;

    public static boolean b(f fVar) {
        androidx.activity.result.i[] iVarArr = fVar.a.a;
        if (iVarArr.length != 1 || iVarArr[0].f608b != 0) {
            return false;
        }
        androidx.activity.result.i[] iVarArr2 = fVar.f23505b.a;
        if (iVarArr2.length != 1 || iVarArr2[0].f608b != 0) {
            return false;
        }
        return true;
    }

    public final void a() {
        try {
            n9.h hVar = new n9.h("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f23512c = hVar;
            this.f23513d = GLES20.glGetUniformLocation(hVar.f22539b, "uMvpMatrix");
            this.f23514e = GLES20.glGetUniformLocation(this.f23512c.f22539b, "uTexMatrix");
            this.f23515f = this.f23512c.c("aPosition");
            this.f23516g = this.f23512c.c("aTexCoords");
            this.f23517h = GLES20.glGetUniformLocation(this.f23512c.f22539b, "uTexture");
        } catch (n9.i e2) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e2);
        }
    }
}
