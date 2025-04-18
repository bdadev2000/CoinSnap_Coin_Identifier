package te;

import a6.k;
import android.graphics.RectF;
import android.opengl.GLES20;
import androidx.work.p;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import wh.a0;

/* loaded from: classes4.dex */
public final class d {
    public final p a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f25381b;

    /* renamed from: c, reason: collision with root package name */
    public qe.a f25382c;

    /* renamed from: d, reason: collision with root package name */
    public qe.a f25383d;

    /* renamed from: e, reason: collision with root package name */
    public int f25384e;

    static {
        int i10 = fe.c.f17817b;
    }

    public d() {
        this(new p(33984, 36197, null));
    }

    public final void a() {
        FloatBuffer floatBuffer;
        boolean z10;
        float f10;
        float f11;
        if (this.f25383d != null) {
            b();
            this.f25382c = this.f25383d;
            this.f25383d = null;
        }
        boolean z11 = false;
        if (this.f25384e == -1) {
            ((qe.b) this.f25382c).getClass();
            ((qe.b) this.f25382c).getClass();
            Intrinsics.checkNotNullParameter("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", "vertexShaderSource");
            Intrinsics.checkNotNullParameter("#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n", "fragmentShaderSource");
            a0[] shaders = {new a0(df.f.f17032m, "uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n"), new a0(df.f.f17033n, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n  gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n")};
            Intrinsics.checkNotNullParameter(shaders, "shaders");
            int m240constructorimpl = UInt.m240constructorimpl(GLES20.glCreateProgram());
            bf.c.b("glCreateProgram");
            if (m240constructorimpl != 0) {
                for (int i10 = 0; i10 < 2; i10++) {
                    GLES20.glAttachShader(m240constructorimpl, UInt.m240constructorimpl(shaders[i10].f27011b));
                    bf.c.b("glAttachShader");
                }
                GLES20.glLinkProgram(m240constructorimpl);
                int[] iArr = new int[1];
                GLES20.glGetProgramiv(m240constructorimpl, df.f.f17031l, iArr, 0);
                if (iArr[0] == 1) {
                    this.f25384e = m240constructorimpl;
                    qe.b bVar = (qe.b) this.f25382c;
                    bVar.getClass();
                    bVar.a = new ef.c(m240constructorimpl, "aPosition", "uMVPMatrix", "aTextureCoord", "uTexMatrix");
                    bVar.f23898b = new cf.b();
                    bf.c.b("program creation");
                } else {
                    String stringPlus = Intrinsics.stringPlus("Could not link program: ", GLES20.glGetProgramInfoLog(m240constructorimpl));
                    GLES20.glDeleteProgram(m240constructorimpl);
                    throw new RuntimeException(stringPlus);
                }
            } else {
                throw new RuntimeException("Could not create program");
            }
        }
        GLES20.glUseProgram(this.f25384e);
        bf.c.b("glUseProgram(handle)");
        this.a.a();
        qe.b bVar2 = (qe.b) this.f25382c;
        ef.c cVar = bVar2.a;
        if (cVar == null) {
            qe.b.f23897d.a(2, "Filter.draw() called after destroying the filter. This can happen rarely because of threading.");
        } else {
            float[] fArr = this.f25381b;
            Intrinsics.checkNotNullParameter(fArr, "<set-?>");
            cVar.f17351e = fArr;
            ef.c cVar2 = bVar2.a;
            cf.b drawable = bVar2.f23898b;
            float[] modelViewProjectionMatrix = (float[]) drawable.f16792e;
            cVar2.getClass();
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            Intrinsics.checkNotNullParameter(modelViewProjectionMatrix, "modelViewProjectionMatrix");
            Intrinsics.checkNotNullParameter(drawable, "drawable");
            Intrinsics.checkNotNullParameter(modelViewProjectionMatrix, "modelViewProjectionMatrix");
            GLES20.glUniformMatrix4fv(cVar2.f17356j.a, 1, false, modelViewProjectionMatrix, 0);
            bf.c.b("glUniformMatrix4fv");
            ef.b bVar3 = cVar2.f17352f;
            if (bVar3 != null) {
                GLES20.glUniformMatrix4fv(bVar3.a, 1, false, cVar2.f17351e, 0);
                bf.c.b("glUniformMatrix4fv");
            }
            ef.b bVar4 = cVar2.f17355i;
            GLES20.glEnableVertexAttribArray(bVar4.f17350b);
            bf.c.b("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(bVar4.f17350b, 2, df.f.a, false, drawable.c() * 4, (Buffer) drawable.f2794g);
            bf.c.b("glVertexAttribPointer");
            ef.b bVar5 = cVar2.f17354h;
            if (bVar5 != null) {
                if (!Intrinsics.areEqual(drawable, cVar2.f17359m) || drawable.f16790c != cVar2.f17358l) {
                    cVar2.f17359m = drawable;
                    cVar2.f17358l = drawable.f16790c;
                    RectF rect = cVar2.f17357k;
                    Intrinsics.checkNotNullParameter(rect, "rect");
                    float f12 = -3.4028235E38f;
                    int i11 = 0;
                    float f13 = Float.MAX_VALUE;
                    float f14 = Float.MAX_VALUE;
                    float f15 = -3.4028235E38f;
                    while (true) {
                        floatBuffer = drawable.f2794g;
                        if (!floatBuffer.hasRemaining()) {
                            break;
                        }
                        float f16 = floatBuffer.get();
                        if (i11 % 2 == 0) {
                            f13 = Math.min(f13, f16);
                            f15 = Math.max(f15, f16);
                        } else {
                            f12 = Math.max(f12, f16);
                            f14 = Math.min(f14, f16);
                        }
                        i11++;
                    }
                    floatBuffer.rewind();
                    rect.set(f13, f12, f15, f14);
                    int limit = (drawable.e().limit() / drawable.c()) * 2;
                    if (cVar2.f17353g.capacity() < limit) {
                        Intrinsics.checkNotNullParameter(cVar2.f17353g, "<this>");
                        cVar2.f17353g = k.t(limit);
                    }
                    cVar2.f17353g.clear();
                    cVar2.f17353g.limit(limit);
                    if (limit > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (i12 % 2 == 0) {
                                z10 = true;
                            } else {
                                z10 = z11;
                            }
                            float f17 = floatBuffer.get(i12);
                            if (z10) {
                                f10 = rect.left;
                            } else {
                                f10 = rect.bottom;
                            }
                            if (z10) {
                                f11 = rect.right;
                            } else {
                                f11 = rect.top;
                            }
                            int i14 = i12 / 2;
                            Intrinsics.checkNotNullParameter(drawable, "drawable");
                            cVar2.f17353g.put((((f17 - f10) / (f11 - f10)) * 1.0f) + 0.0f);
                            if (i13 >= limit) {
                                break;
                            }
                            i12 = i13;
                            z11 = false;
                        }
                    }
                }
                cVar2.f17353g.rewind();
                GLES20.glEnableVertexAttribArray(bVar5.f17350b);
                bf.c.b("glEnableVertexAttribArray");
                GLES20.glVertexAttribPointer(bVar5.f17350b, 2, df.f.a, false, drawable.c() * 4, (Buffer) cVar2.f17353g);
                bf.c.b("glVertexAttribPointer");
            }
            ef.c cVar3 = bVar2.a;
            cf.b drawable2 = bVar2.f23898b;
            cVar3.getClass();
            Intrinsics.checkNotNullParameter(drawable2, "drawable");
            drawable2.d();
            ef.c cVar4 = bVar2.a;
            cf.b drawable3 = bVar2.f23898b;
            cVar4.getClass();
            Intrinsics.checkNotNullParameter(drawable3, "drawable");
            Intrinsics.checkNotNullParameter(drawable3, "drawable");
            GLES20.glDisableVertexAttribArray(cVar4.f17355i.f17350b);
            ef.b bVar6 = cVar4.f17354h;
            if (bVar6 != null) {
                GLES20.glDisableVertexAttribArray(bVar6.f17350b);
            }
            bf.c.b("onPostDraw end");
        }
        GLES20.glBindTexture(UInt.m240constructorimpl(36197), UInt.m240constructorimpl(0));
        GLES20.glActiveTexture(df.f.f17022c);
        bf.c.b("unbind");
        GLES20.glUseProgram(0);
        bf.c.b("glUseProgram(0)");
    }

    public final void b() {
        if (this.f25384e == -1) {
            return;
        }
        qe.b bVar = (qe.b) this.f25382c;
        ef.c cVar = bVar.a;
        if (!cVar.f17349d) {
            if (cVar.f17347b) {
                GLES20.glDeleteProgram(UInt.m240constructorimpl(cVar.a));
            }
            for (a0 a0Var : cVar.f17348c) {
                GLES20.glDeleteShader(UInt.m240constructorimpl(a0Var.f27011b));
            }
            cVar.f17349d = true;
        }
        Intrinsics.checkNotNullParameter(cVar.f17353g, "<this>");
        bVar.a = null;
        bVar.f23898b = null;
        GLES20.glDeleteProgram(this.f25384e);
        this.f25384e = -1;
    }

    public d(p pVar) {
        this.f25381b = (float[]) bf.c.a.clone();
        this.f25382c = new qe.b();
        this.f25383d = null;
        this.f25384e = -1;
        this.a = pVar;
    }
}
