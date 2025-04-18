package androidx.datastore.preferences;

import androidx.datastore.migrations.SharedPreferencesView;
import androidx.datastore.preferences.core.Preferences;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import q0.q;

@e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class SharedPreferencesMigrationKt$getMigrationFunction$1 extends i implements q {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ SharedPreferencesView f19084a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Preferences f19085b;

    /* JADX WARN: Type inference failed for: r0v0, types: [j0.i, androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1] */
    @Override // q0.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ?? iVar = new i(3, (g) obj3);
        iVar.f19084a = (SharedPreferencesView) obj;
        iVar.f19085b = (Preferences) obj2;
        iVar.invokeSuspend(b0.f30125a);
        throw null;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        kotlin.jvm.internal.q.m(obj);
        SharedPreferencesView sharedPreferencesView = this.f19084a;
        Set keySet = this.f19085b.a().keySet();
        ArrayList arrayList = new ArrayList(e0.q.M(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).f19096a);
        }
        sharedPreferencesView.getClass();
        throw null;
    }
}
