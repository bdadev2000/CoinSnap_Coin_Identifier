package androidx.profileinstaller;

import A4.d;
import C0.h;
import J0.b;
import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements b {
    @Override // J0.b
    public final List a() {
        return Collections.emptyList();
    }

    @Override // J0.b
    public final Object create(Context context) {
        h.a(new d(1, this, context.getApplicationContext()));
        return new Object();
    }
}
