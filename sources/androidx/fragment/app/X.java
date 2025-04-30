package androidx.fragment.app;

import android.util.Log;
import h.C2310a;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public final class X implements h.b {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f4690c;

    public /* synthetic */ X(FragmentManager fragmentManager, int i9) {
        this.b = i9;
        this.f4690c = fragmentManager;
    }

    @Override // h.b
    public final void b(Object obj) {
        x0 x0Var;
        int i9;
        x0 x0Var2;
        x0 x0Var3;
        switch (this.b) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (((Boolean) arrayList.get(i10)).booleanValue()) {
                        i9 = 0;
                    } else {
                        i9 = -1;
                    }
                    iArr[i10] = i9;
                }
                FragmentManager fragmentManager = this.f4690c;
                C0466h0 pollFirst = fragmentManager.mLaunchedFragments.pollFirst();
                if (pollFirst != null) {
                    x0Var = fragmentManager.mFragmentStore;
                    String str = pollFirst.b;
                    Fragment c9 = x0Var.c(str);
                    if (c9 == null) {
                        Log.w(FragmentManager.TAG, "Permission request result delivered for unknown Fragment " + str);
                        return;
                    }
                    c9.onRequestPermissionsResult(pollFirst.f4726c, strArr, iArr);
                    return;
                }
                Log.w(FragmentManager.TAG, "No permissions were requested for " + this);
                return;
            case 1:
                C2310a c2310a = (C2310a) obj;
                FragmentManager fragmentManager2 = this.f4690c;
                C0466h0 pollLast = fragmentManager2.mLaunchedFragments.pollLast();
                if (pollLast != null) {
                    x0Var2 = fragmentManager2.mFragmentStore;
                    String str2 = pollLast.b;
                    Fragment c10 = x0Var2.c(str2);
                    if (c10 == null) {
                        Log.w(FragmentManager.TAG, "Activity result delivered for unknown Fragment " + str2);
                        return;
                    } else {
                        c10.onActivityResult(pollLast.f4726c, c2310a.b, c2310a.f20551c);
                        return;
                    }
                }
                Log.w(FragmentManager.TAG, "No Activities were started for result for " + this);
                return;
            default:
                C2310a c2310a2 = (C2310a) obj;
                FragmentManager fragmentManager3 = this.f4690c;
                C0466h0 pollFirst2 = fragmentManager3.mLaunchedFragments.pollFirst();
                if (pollFirst2 != null) {
                    x0Var3 = fragmentManager3.mFragmentStore;
                    String str3 = pollFirst2.b;
                    Fragment c11 = x0Var3.c(str3);
                    if (c11 == null) {
                        Log.w(FragmentManager.TAG, "Intent Sender result delivered for unknown Fragment " + str3);
                        return;
                    } else {
                        c11.onActivityResult(pollFirst2.f4726c, c2310a2.b, c2310a2.f20551c);
                        return;
                    }
                }
                Log.w(FragmentManager.TAG, "No IntentSenders were started for " + this);
                return;
        }
    }
}
