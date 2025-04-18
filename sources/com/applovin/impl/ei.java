package com.applovin.impl;

import android.opengl.GLES20;
import com.applovin.impl.ci;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* loaded from: classes2.dex */
final class ei {

    /* renamed from: j, reason: collision with root package name */
    private static final String[] f23711j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};

    /* renamed from: k, reason: collision with root package name */
    private static final String[] f23712k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f23713l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f23714m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: n, reason: collision with root package name */
    private static final float[] f23715n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: o, reason: collision with root package name */
    private static final float[] f23716o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: p, reason: collision with root package name */
    private static final float[] f23717p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private int f23718a;

    /* renamed from: b, reason: collision with root package name */
    private a f23719b;

    /* renamed from: c, reason: collision with root package name */
    private a f23720c;
    private int d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f23721f;

    /* renamed from: g, reason: collision with root package name */
    private int f23722g;

    /* renamed from: h, reason: collision with root package name */
    private int f23723h;

    /* renamed from: i, reason: collision with root package name */
    private int f23724i;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f23725a;

        /* renamed from: b, reason: collision with root package name */
        private final FloatBuffer f23726b;

        /* renamed from: c, reason: collision with root package name */
        private final FloatBuffer f23727c;
        private final int d;

        public a(ci.b bVar) {
            this.f23725a = bVar.a();
            this.f23726b = ba.a(bVar.f23285c);
            this.f23727c = ba.a(bVar.d);
            int i2 = bVar.f23284b;
            if (i2 == 1) {
                this.d = 5;
            } else if (i2 != 2) {
                this.d = 4;
            } else {
                this.d = 6;
            }
        }
    }

    public void a(int i2, float[] fArr, boolean z2) {
        a aVar = z2 ? this.f23720c : this.f23719b;
        if (aVar == null) {
            return;
        }
        GLES20.glUseProgram(this.d);
        ba.a();
        GLES20.glEnableVertexAttribArray(this.f23722g);
        GLES20.glEnableVertexAttribArray(this.f23723h);
        ba.a();
        int i3 = this.f23718a;
        GLES20.glUniformMatrix3fv(this.f23721f, 1, false, i3 == 1 ? z2 ? f23715n : f23714m : i3 == 2 ? z2 ? f23717p : f23716o : f23713l, 0);
        GLES20.glUniformMatrix4fv(this.e, 1, false, fArr, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i2);
        GLES20.glUniform1i(this.f23724i, 0);
        ba.a();
        GLES20.glVertexAttribPointer(this.f23722g, 3, 5126, false, 12, (Buffer) aVar.f23726b);
        ba.a();
        GLES20.glVertexAttribPointer(this.f23723h, 2, 5126, false, 8, (Buffer) aVar.f23727c);
        ba.a();
        GLES20.glDrawArrays(aVar.d, 0, aVar.f23725a);
        ba.a();
        GLES20.glDisableVertexAttribArray(this.f23722g);
        GLES20.glDisableVertexAttribArray(this.f23723h);
    }

    public void b(ci ciVar) {
        if (a(ciVar)) {
            this.f23718a = ciVar.f23281c;
            a aVar = new a(ciVar.f23279a.a(0));
            this.f23719b = aVar;
            if (!ciVar.d) {
                aVar = new a(ciVar.f23280b.a(0));
            }
            this.f23720c = aVar;
        }
    }

    public void a() {
        int a2 = ba.a(f23711j, f23712k);
        this.d = a2;
        this.e = GLES20.glGetUniformLocation(a2, "uMvpMatrix");
        this.f23721f = GLES20.glGetUniformLocation(this.d, "uTexMatrix");
        this.f23722g = GLES20.glGetAttribLocation(this.d, "aPosition");
        this.f23723h = GLES20.glGetAttribLocation(this.d, "aTexCoords");
        this.f23724i = GLES20.glGetUniformLocation(this.d, "uTexture");
    }

    public static boolean a(ci ciVar) {
        ci.a aVar = ciVar.f23279a;
        ci.a aVar2 = ciVar.f23280b;
        return aVar.a() == 1 && aVar.a(0).f23283a == 0 && aVar2.a() == 1 && aVar2.a(0).f23283a == 0;
    }
}
