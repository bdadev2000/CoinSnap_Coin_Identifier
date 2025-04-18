package androidx.profileinstaller;

import android.content.Context;
import c2.b;
import h.o0;
import java.util.Collections;
import java.util.List;
import ka.e;
import u1.f;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // c2.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // c2.b
    public final Object create(Context context) {
        f.a(new o0(5, this, context.getApplicationContext()));
        return new e();
    }
}
