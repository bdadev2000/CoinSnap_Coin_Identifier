package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.zh;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
final class bi {

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f6872j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f6873k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    private static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f6874n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f6875o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p, reason: collision with root package name */
    private static final float[] f6876p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f6877a;
    private a b;

    /* renamed from: c, reason: collision with root package name */
    private a f6878c;

    /* renamed from: d, reason: collision with root package name */
    private int f6879d;

    /* renamed from: e, reason: collision with root package name */
    private int f6880e;

    /* renamed from: f, reason: collision with root package name */
    private int f6881f;

    /* renamed from: g, reason: collision with root package name */
    private int f6882g;

    /* renamed from: h, reason: collision with root package name */
    private int f6883h;

    /* renamed from: i, reason: collision with root package name */
    private int f6884i;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f6885a;
        private final FloatBuffer b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f6886c;

        /* renamed from: d, reason: collision with root package name */
        private final int f6887d;

        public a(zh.b bVar) {
            this.f6885a = bVar.a();
            this.b = z9.a(bVar.f12586c);
            this.f6886c = z9.a(bVar.f12587d);
            int i9 = bVar.b;
            if (i9 != 1) {
                if (i9 != 2) {
                    this.f6887d = 4;
                    return;
                } else {
                    this.f6887d = 6;
                    return;
                }
            }
            this.f6887d = 5;
        }
    }

    public void a(int i9, float[] fArr, boolean z8) {
        float[] fArr2;
        a aVar = z8 ? this.f6878c : this.b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.f6879d);
        z9.a();
        GLES20.glEnableVertexAttribArray(this.f6882g);
        GLES20.glEnableVertexAttribArray(this.f6883h);
        z9.a();
        int i10 = this.f6877a;
        if (i10 == 1) {
            fArr2 = z8 ? f6874n : m;
        } else if (i10 == 2) {
            fArr2 = z8 ? f6876p : f6875o;
        } else {
            fArr2 = l;
        }
        GLES20.glUniformMatrix3fv(this.f6881f, 1, false, fArr2, 0);
        GLES20.glUniformMatrix4fv(this.f6880e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i9);
        GLES20.glUniform1i(this.f6884i, 0);
        z9.a();
        GLES20.glVertexAttribPointer(this.f6882g, 3, 5126, false, 12, (Buffer) aVar.b);
        z9.a();
        GLES20.glVertexAttribPointer(this.f6883h, 2, 5126, false, 8, (Buffer) aVar.f6886c);
        z9.a();
        GLES20.glDrawArrays(aVar.f6887d, 0, aVar.f6885a);
        z9.a();
        GLES20.glDisableVertexAttribArray(this.f6882g);
        GLES20.glDisableVertexAttribArray(this.f6883h);
    }

    public void b(zh zhVar) {
        if (!a(zhVar)) {
            return;
        }
        this.f6877a = zhVar.f12582c;
        a aVar = new a(zhVar.f12581a.a(0));
        this.b = aVar;
        if (!zhVar.f12583d) {
            aVar = new a(zhVar.b.a(0));
        }
        this.f6878c = aVar;
    }

    public void a() {
        int a6 = z9.a(f6872j, f6873k);
        this.f6879d = a6;
        this.f6880e = GLES20.glGetUniformLocation(a6, "uMvpMatrix");
        this.f6881f = GLES20.glGetUniformLocation(this.f6879d, "uTexMatrix");
        this.f6882g = GLES20.glGetAttribLocation(this.f6879d, "aPosition");
        this.f6883h = GLES20.glGetAttribLocation(this.f6879d, "aTexCoords");
        this.f6884i = GLES20.glGetUniformLocation(this.f6879d, "uTexture");
    }

    public static boolean a(zh zhVar) {
        zh.a aVar = zhVar.f12581a;
        zh.a aVar2 = zhVar.b;
        return aVar.a() == 1 && aVar.a(0).f12585a == 0 && aVar2.a() == 1 && aVar2.a(0).f12585a == 0;
    }
}
