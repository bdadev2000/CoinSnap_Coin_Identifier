package androidx.datastore.preferences;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.r;
import q0.a;

/* loaded from: classes3.dex */
final class PreferenceDataStoreSingletonDelegate$getValue$1$1 extends r implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f19071a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PreferenceDataStoreSingletonDelegate f19072b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PreferenceDataStoreSingletonDelegate$getValue$1$1(Context context, PreferenceDataStoreSingletonDelegate preferenceDataStoreSingletonDelegate) {
        super(0);
        this.f19071a = context;
        this.f19072b = preferenceDataStoreSingletonDelegate;
    }

    @Override // q0.a
    public final Object invoke() {
        Context context = this.f19071a;
        p0.a.r(context, "applicationContext");
        String str = this.f19072b.f19067a;
        p0.a.s(str, "name");
        String z02 = p0.a.z0(".preferences_pb", str);
        p0.a.s(z02, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), p0.a.z0(z02, "datastore/"));
    }
}
