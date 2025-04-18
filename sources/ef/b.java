package ef;

import android.opengl.GLES20;
import android.util.Log;
import kotlin.NoWhenBranchMatchedException;
import kotlin.UInt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class b {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f17350b;

    public /* synthetic */ b(int i10, int i11) {
        this.a = i10;
        this.f17350b = i11;
    }

    public int a() {
        int i10 = this.f17350b;
        if (i10 == 2) {
            return 10;
        }
        if (i10 == 5) {
            return 11;
        }
        if (i10 == 29) {
            return 12;
        }
        if (i10 == 42) {
            return 16;
        }
        if (i10 != 22) {
            return i10 != 23 ? 0 : 15;
        }
        return 1073741824;
    }

    public b(JSONObject jSONObject) {
        this.a = jSONObject.getInt("commitmentPaymentsCount");
        this.f17350b = jSONObject.optInt("subsequentCommitmentPaymentsCount");
    }

    public b(int i10, int i11, String label) {
        int glGetAttribLocation;
        if (i11 != 0) {
            int i12 = i11 - 1;
            if (i12 == 0) {
                glGetAttribLocation = GLES20.glGetAttribLocation(UInt.m240constructorimpl(i10), label);
            } else {
                if (i12 != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                glGetAttribLocation = GLES20.glGetUniformLocation(UInt.m240constructorimpl(i10), label);
            }
            this.a = glGetAttribLocation;
            float[] fArr = bf.c.a;
            Intrinsics.checkNotNullParameter(label, "label");
            if (glGetAttribLocation >= 0) {
                this.f17350b = UInt.m240constructorimpl(glGetAttribLocation);
                return;
            }
            String str = "Unable to locate " + label + " in program";
            Log.e("Egloo", str);
            throw new RuntimeException(str);
        }
        throw null;
    }

    public b() {
    }
}
