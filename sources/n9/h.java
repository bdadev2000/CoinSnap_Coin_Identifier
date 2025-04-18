package n9;

import android.opengl.GLES20;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class h {
    public final /* synthetic */ int a = 1;

    /* renamed from: b, reason: collision with root package name */
    public int f22539b = -1;

    /* renamed from: c, reason: collision with root package name */
    public Serializable f22540c;

    /* renamed from: d, reason: collision with root package name */
    public Serializable f22541d;

    /* renamed from: e, reason: collision with root package name */
    public Object f22542e;

    /* renamed from: f, reason: collision with root package name */
    public Object f22543f;

    public h() {
    }

    public static int a(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    public static void b(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z10 = true;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            z10 = false;
        }
        com.bumptech.glide.c.k(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z10);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        com.bumptech.glide.c.j();
    }

    public final int c(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f22539b, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        com.bumptech.glide.c.j();
        return glGetAttribLocation;
    }

    public final String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb2 = new StringBuilder(200);
                sb2.append("<<\n mode: ");
                sb2.append((hd.b) this.f22540c);
                sb2.append("\n ecLevel: ");
                sb2.append((hd.a) this.f22541d);
                sb2.append("\n version: ");
                sb2.append((hd.c) this.f22542e);
                sb2.append("\n maskPattern: ");
                sb2.append(this.f22539b);
                if (((e1.b) this.f22543f) == null) {
                    sb2.append("\n matrix: null\n");
                } else {
                    sb2.append("\n matrix:\n");
                    sb2.append((e1.b) this.f22543f);
                }
                sb2.append(">>\n");
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.activity.result.i[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r4v7, types: [u7.a[], java.io.Serializable] */
    public h(String str, String str2) {
        com.bumptech.glide.c.j();
        b(this.f22539b, 35633, str);
        b(this.f22539b, 35632, str2);
        GLES20.glLinkProgram(this.f22539b);
        int i10 = 1;
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.f22539b, 35714, iArr, 0);
        com.bumptech.glide.c.k("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(this.f22539b), iArr[0] == 1);
        GLES20.glUseProgram(this.f22539b);
        this.f22542e = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(this.f22539b, 35721, iArr2, 0);
        this.f22540c = new u7.a[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f22539b;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr, 0);
            String str3 = new String(bArr, 0, a(bArr));
            u7.a aVar = new u7.a(str3, i11, GLES20.glGetAttribLocation(i12, str3));
            ((u7.a[]) this.f22540c)[i11] = aVar;
            ((Map) this.f22542e).put(str3, aVar);
            i11++;
            i10 = 1;
        }
        this.f22543f = new HashMap();
        int i14 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f22539b, 35718, iArr4, 0);
        this.f22541d = new androidx.activity.result.i[iArr4[0]];
        int i15 = 0;
        while (i15 < iArr4[0]) {
            int i16 = this.f22539b;
            int[] iArr5 = new int[i14];
            GLES20.glGetProgramiv(i16, 35719, iArr5, 0);
            int[] iArr6 = new int[i14];
            int i17 = iArr5[0];
            byte[] bArr2 = new byte[i17];
            GLES20.glGetActiveUniform(i16, i15, i17, new int[i14], 0, new int[i14], 0, iArr6, 0, bArr2, 0);
            String str4 = new String(bArr2, 0, a(bArr2));
            androidx.activity.result.i iVar = new androidx.activity.result.i(str4, GLES20.glGetUniformLocation(i16, str4), iArr6[0]);
            ((androidx.activity.result.i[]) this.f22541d)[i15] = iVar;
            ((Map) this.f22543f).put((String) iVar.f610d, iVar);
            i15++;
            i14 = 1;
        }
        com.bumptech.glide.c.j();
    }
}
