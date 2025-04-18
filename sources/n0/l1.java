package n0;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class l1 extends Lambda implements Function1 {

    /* renamed from: c, reason: collision with root package name */
    public static final l1 f22308c = new l1(0);

    /* renamed from: d, reason: collision with root package name */
    public static final l1 f22309d = new l1(1);

    /* renamed from: f, reason: collision with root package name */
    public static final l1 f22310f = new l1(2);

    /* renamed from: g, reason: collision with root package name */
    public static final l1 f22311g = new l1(3);

    /* renamed from: h, reason: collision with root package name */
    public static final l1 f22312h;

    /* renamed from: i, reason: collision with root package name */
    public static final l1 f22313i;

    /* renamed from: j, reason: collision with root package name */
    public static final l1 f22314j;

    /* renamed from: k, reason: collision with root package name */
    public static final l1 f22315k;

    /* renamed from: l, reason: collision with root package name */
    public static final l1 f22316l;

    /* renamed from: m, reason: collision with root package name */
    public static final l1 f22317m;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f22318b;

    static {
        new l1(4);
        new l1(5);
        new l1(6);
        new l1(7);
        new l1(8);
        new l1(9);
        f22312h = new l1(10);
        f22313i = new l1(11);
        f22314j = new l1(12);
        f22315k = new l1(13);
        f22316l = new l1(14);
        f22317m = new l1(15);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(int i10) {
        super(1);
        this.f22318b = i10;
    }

    public final c1.a a(y0.b ex) {
        boolean z10 = true;
        switch (this.f22318b) {
            case 10:
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w("FirebaseSessionsRepo", "CorruptionException in sessions DataStore in " + w5.d.e() + '.', ex);
                return new c1.a(z10);
            default:
                Intrinsics.checkNotNullParameter(ex, "ex");
                Log.w("SessionsSettings", "CorruptionException in settings DataStore in " + w5.d.e() + '.', ex);
                return new c1.a(z10);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ViewGroup viewGroup;
        String valueOf;
        switch (this.f22318b) {
            case 0:
                View view = (View) obj;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup == null) {
                    return null;
                }
                return new k1(viewGroup, 0).iterator();
            case 1:
                Context it = (Context) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt.emptyList();
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                Intrinsics.checkNotNullParameter(entry, "entry");
                Object value = entry.getValue();
                if (value instanceof byte[]) {
                    valueOf = ArraysKt.l((byte[]) value);
                } else {
                    valueOf = String.valueOf(entry.getValue());
                }
                return kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.n(new StringBuilder("  "), ((c1.e) entry.getKey()).a, " = ", valueOf);
            case 3:
                k1.c initializer = (k1.c) obj;
                Intrinsics.checkNotNullParameter(initializer, "$this$initializer");
                return new androidx.lifecycle.t0();
            case 4:
                z1.a obj2 = (z1.a) obj;
                Intrinsics.checkNotNullParameter(obj2, "obj");
                return obj2.B();
            case 5:
                z1.a db2 = (z1.a) obj;
                Intrinsics.checkNotNullParameter(db2, "db");
                return Boolean.valueOf(db2.R());
            case 6:
                z1.a obj3 = (z1.a) obj;
                Intrinsics.checkNotNullParameter(obj3, "obj");
                return obj3.z();
            case 7:
                z1.a it2 = (z1.a) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                return null;
            case 8:
                z1.j obj4 = (z1.j) obj;
                Intrinsics.checkNotNullParameter(obj4, "obj");
                return Long.valueOf(obj4.M());
            case 9:
                z1.j obj5 = (z1.j) obj;
                Intrinsics.checkNotNullParameter(obj5, "obj");
                return Integer.valueOf(obj5.D());
            case 10:
                return a((y0.b) obj);
            case 11:
                return a((y0.b) obj);
            case 12:
                lc.g remoteConfigSettings = (lc.g) obj;
                Intrinsics.checkNotNullParameter(remoteConfigSettings, "$this$remoteConfigSettings");
                remoteConfigSettings.a = 3600L;
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                Log.d("duylt", "IMPORTANT: Do not remove this line code!");
                return Unit.INSTANCE;
            default:
                li.g entry2 = (li.g) obj;
                Intrinsics.checkNotNullParameter(entry2, "entry");
                ki.b0 b0Var = li.f.f21387c;
                return Boolean.valueOf(wh.c0.a(entry2.a));
        }
    }
}
