package androidx.navigation.compose;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.NavBackStackEntryState;
import androidx.navigation.NavHostController;
import e0.c;
import e0.n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.r;
import q0.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class NavHostControllerKt$NavControllerSaver$2 extends r implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f20585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavHostControllerKt$NavControllerSaver$2(Context context) {
        super(1);
        this.f20585a = context;
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Bundle bundle = (Bundle) obj;
        NavHostController a2 = NavHostControllerKt.a(this.f20585a);
        if (bundle != null) {
            bundle.setClassLoader(a2.f20345a.getClassLoader());
            a2.d = bundle.getBundle("android-support-nav:controller:navigatorState");
            a2.e = bundle.getParcelableArray("android-support-nav:controller:backStack");
            LinkedHashMap linkedHashMap = a2.f20357o;
            linkedHashMap.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (intArray != null && stringArrayList != null) {
                int length = intArray.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    a2.f20356n.put(Integer.valueOf(intArray[i2]), stringArrayList.get(i3));
                    i2++;
                    i3++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        p0.a.r(str, "id");
                        n nVar = new n(parcelableArray.length);
                        c t2 = e.t(parcelableArray);
                        while (t2.hasNext()) {
                            Parcelable parcelable = (Parcelable) t2.next();
                            p0.a.q(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            nVar.addLast((NavBackStackEntryState) parcelable);
                        }
                        linkedHashMap.put(str, nVar);
                    }
                }
            }
            a2.f20348f = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
        return a2;
    }
}
