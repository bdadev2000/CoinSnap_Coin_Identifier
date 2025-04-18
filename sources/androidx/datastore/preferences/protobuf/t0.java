package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: b, reason: collision with root package name */
    public static final r0 f1467b = new r0();
    public final z0 a;

    public t0() {
        z0 z0Var;
        z0[] z0VarArr = new z0[2];
        z0VarArr[0] = a0.a;
        try {
            z0Var = (z0) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            z0Var = f1467b;
        }
        z0VarArr[1] = z0Var;
        s0 s0Var = new s0(z0VarArr);
        Charset charset = h0.a;
        this.a = s0Var;
    }
}
