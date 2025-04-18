package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.zh;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
final class bi {

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f3890j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f3891k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f3892l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f3893m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f3894n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f3895o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p, reason: collision with root package name */
    private static final float[] f3896p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private a f3897b;

    /* renamed from: c, reason: collision with root package name */
    private a f3898c;

    /* renamed from: d, reason: collision with root package name */
    private int f3899d;

    /* renamed from: e, reason: collision with root package name */
    private int f3900e;

    /* renamed from: f, reason: collision with root package name */
    private int f3901f;

    /* renamed from: g, reason: collision with root package name */
    private int f3902g;

    /* renamed from: h, reason: collision with root package name */
    private int f3903h;

    /* renamed from: i, reason: collision with root package name */
    private int f3904i;

    /* loaded from: classes.dex */
    public static class a {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f3905b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f3906c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3907d;

        public a(zh.b bVar) {
            this.a = bVar.a();
            this.f3905b = z9.a(bVar.f9402c);
            this.f3906c = z9.a(bVar.f9403d);
            int i10 = bVar.f9401b;
            if (i10 != 1) {
                if (i10 != 2) {
                    this.f3907d = 4;
                    return;
                } else {
                    this.f3907d = 6;
                    return;
                }
            }
            this.f3907d = 5;
        }
    }

    public void a(int i10, float[] fArr, boolean z10) {
        float[] fArr2;
        a aVar = z10 ? this.f3898c : this.f3897b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.f3899d);
        z9.a();
        GLES20.glEnableVertexAttribArray(this.f3902g);
        GLES20.glEnableVertexAttribArray(this.f3903h);
        z9.a();
        int i11 = this.a;
        if (i11 == 1) {
            fArr2 = z10 ? f3894n : f3893m;
        } else if (i11 == 2) {
            fArr2 = z10 ? f3896p : f3895o;
        } else {
            fArr2 = f3892l;
        }
        GLES20.glUniformMatrix3fv(this.f3901f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f3900e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i10);
        GLES20.glUniform1i(this.f3904i, 0);
        z9.a();
        GLES20.glVertexAttribPointer(this.f3902g, 3, 5126, false, 12, (Buffer) aVar.f3905b);
        z9.a();
        GLES20.glVertexAttribPointer(this.f3903h, 2, 5126, false, 8, (Buffer) aVar.f3906c);
        z9.a();
        GLES20.glDrawArrays(aVar.f3907d, 0, aVar.a);
        z9.a();
        GLES20.glDisableVertexAttribArray(this.f3902g);
        GLES20.glDisableVertexAttribArray(this.f3903h);
    }

    public void b(zh zhVar) {
        if (!a(zhVar)) {
            return;
        }
        this.a = zhVar.f9399c;
        a aVar = new a(zhVar.a.a(0));
        this.f3897b = aVar;
        if (!zhVar.f9400d) {
            aVar = new a(zhVar.f9398b.a(0));
        }
        this.f3898c = aVar;
    }

    public void a() {
        int a10 = z9.a(f3890j, f3891k);
        this.f3899d = a10;
        this.f3900e = GLES20.glGetUniformLocation(a10, "uMvpMatrix");
        this.f3901f = GLES20.glGetUniformLocation(this.f3899d, "uTexMatrix");
        this.f3902g = GLES20.glGetAttribLocation(this.f3899d, "aPosition");
        this.f3903h = GLES20.glGetAttribLocation(this.f3899d, "aTexCoords");
        this.f3904i = GLES20.glGetUniformLocation(this.f3899d, "uTexture");
    }

    public static boolean a(zh zhVar) {
        zh.a aVar = zhVar.a;
        zh.a aVar2 = zhVar.f9398b;
        return aVar.a() == 1 && aVar.a(0).a == 0 && aVar2.a() == 1 && aVar2.a(0).a == 0;
    }
}
