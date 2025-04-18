package androidx.datastore.preferences;

import androidx.datastore.preferences.core.Preferences;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.q;
import q0.p;

@e(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class SharedPreferencesMigrationKt$getShouldRunMigration$1 extends i implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f19086a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f19087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPreferencesMigrationKt$getShouldRunMigration$1(Set set, g gVar) {
        super(2, gVar);
        this.f19087b = set;
    }

    @Override // j0.a
    public final g create(Object obj, g gVar) {
        SharedPreferencesMigrationKt$getShouldRunMigration$1 sharedPreferencesMigrationKt$getShouldRunMigration$1 = new SharedPreferencesMigrationKt$getShouldRunMigration$1(this.f19087b, gVar);
        sharedPreferencesMigrationKt$getShouldRunMigration$1.f19086a = obj;
        return sharedPreferencesMigrationKt$getShouldRunMigration$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPreferencesMigrationKt$getShouldRunMigration$1) create((Preferences) obj, (g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        a aVar = a.f30806a;
        q.m(obj);
        Set keySet = ((Preferences) this.f19086a).a().keySet();
        ArrayList arrayList = new ArrayList(e0.q.M(keySet, 10));
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((Preferences.Key) it.next()).f19096a);
        }
        LinkedHashSet linkedHashSet = SharedPreferencesMigrationKt.f19083a;
        boolean z2 = true;
        Set set = this.f19087b;
        if (set != linkedHashSet) {
            Set set2 = set;
            if (!(set2 instanceof Collection) || !set2.isEmpty()) {
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (Boolean.valueOf(!arrayList.contains((String) it2.next())).booleanValue()) {
                        break;
                    }
                }
            }
            z2 = false;
        }
        return Boolean.valueOf(z2);
    }
}
