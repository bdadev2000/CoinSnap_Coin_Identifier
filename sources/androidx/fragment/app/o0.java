package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class o0 implements androidx.activity.result.b, f2, n.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1699b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1700c;

    public /* synthetic */ o0(Object obj, int i10) {
        this.f1699b = i10;
        this.f1700c = obj;
    }

    @Override // androidx.activity.result.b
    public final void a(Object obj) {
        int i10;
        switch (this.f1699b) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (((Boolean) arrayList.get(i11)).booleanValue()) {
                        i10 = 0;
                    } else {
                        i10 = -1;
                    }
                    iArr[i11] = i10;
                }
                FragmentManager fragmentManager = (FragmentManager) this.f1700c;
                x0 pollFirst = fragmentManager.mLaunchedFragments.pollFirst();
                if (pollFirst == null) {
                    Log.w(FragmentManager.TAG, "No permissions were requested for " + this);
                    return;
                }
                l1 access$200 = FragmentManager.access$200(fragmentManager);
                String str = pollFirst.f1739b;
                Fragment c10 = access$200.c(str);
                if (c10 == null) {
                    Log.w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                c10.onRequestPermissionsResult(pollFirst.f1740c, strArr, iArr);
                return;
            case 1:
                b((androidx.activity.result.a) obj);
                return;
            default:
                b((androidx.activity.result.a) obj);
                return;
        }
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        Fragment fragment = (Fragment) this.f1700c;
        Object obj2 = fragment.mHost;
        if (obj2 instanceof androidx.activity.result.h) {
            return ((androidx.activity.result.h) obj2).getActivityResultRegistry();
        }
        return fragment.requireActivity().getActivityResultRegistry();
    }

    public final void b(androidx.activity.result.a aVar) {
        int i10 = this.f1699b;
        Object obj = this.f1700c;
        switch (i10) {
            case 1:
                FragmentManager fragmentManager = (FragmentManager) obj;
                x0 pollLast = fragmentManager.mLaunchedFragments.pollLast();
                if (pollLast == null) {
                    Log.w(FragmentManager.TAG, "No Activities were started for result for " + this);
                    return;
                }
                l1 access$200 = FragmentManager.access$200(fragmentManager);
                String str = pollLast.f1739b;
                Fragment c10 = access$200.c(str);
                if (c10 == null) {
                    Log.w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str);
                    return;
                } else {
                    c10.onActivityResult(pollLast.f1740c, aVar.f595b, aVar.f596c);
                    return;
                }
            default:
                FragmentManager fragmentManager2 = (FragmentManager) obj;
                x0 pollFirst = fragmentManager2.mLaunchedFragments.pollFirst();
                if (pollFirst == null) {
                    Log.w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                    return;
                }
                l1 access$2002 = FragmentManager.access$200(fragmentManager2);
                String str2 = pollFirst.f1739b;
                Fragment c11 = access$2002.c(str2);
                if (c11 == null) {
                    Log.w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str2);
                    return;
                } else {
                    c11.onActivityResult(pollFirst.f1740c, aVar.f595b, aVar.f596c);
                    return;
                }
        }
    }
}
