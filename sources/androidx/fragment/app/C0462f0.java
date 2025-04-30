package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.Log;
import h.C2310a;
import i.AbstractC2330a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import t7.C2720i;
import u7.AbstractC2815f;
import u7.AbstractC2818i;
import u7.AbstractC2829t;
import u7.C2825p;

/* renamed from: androidx.fragment.app.f0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0462f0 extends AbstractC2330a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4719a;

    public /* synthetic */ C0462f0(int i9) {
        this.f4719a = i9;
    }

    @Override // i.AbstractC2330a
    public final Intent a(Context context, Object obj) {
        Bundle bundleExtra;
        switch (this.f4719a) {
            case 0:
                h.k kVar = (h.k) obj;
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = kVar.f20566c;
                if (intent2 != null && (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        IntentSender intentSender = kVar.b;
                        G7.j.e(intentSender, "intentSender");
                        kVar = new h.k(intentSender, null, kVar.f20567d, kVar.f20568f);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar);
                if (FragmentManager.isLoggingEnabled(2)) {
                    Log.v(FragmentManager.TAG, "CreateIntent created the following intent: " + intent);
                }
                return intent;
            case 1:
                String[] strArr = (String[]) obj;
                G7.j.e(context, "context");
                G7.j.e(strArr, "input");
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                G7.j.d(putExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra;
            case 2:
                String str = (String) obj;
                G7.j.e(context, "context");
                G7.j.e(str, "input");
                Intent putExtra2 = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                G7.j.d(putExtra2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
                return putExtra2;
            case 3:
                Intent intent3 = (Intent) obj;
                G7.j.e(context, "context");
                G7.j.e(intent3, "input");
                return intent3;
            default:
                h.k kVar2 = (h.k) obj;
                G7.j.e(context, "context");
                G7.j.e(kVar2, "input");
                Intent putExtra3 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", kVar2);
                G7.j.d(putExtra3, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
                return putExtra3;
        }
    }

    @Override // i.AbstractC2330a
    public com.bumptech.glide.f b(Context context, Object obj) {
        switch (this.f4719a) {
            case 1:
                String[] strArr = (String[]) obj;
                G7.j.e(context, "context");
                G7.j.e(strArr, "input");
                if (strArr.length == 0) {
                    return new com.bumptech.glide.f(C2825p.b, 5);
                }
                for (String str : strArr) {
                    if (I.h.checkSelfPermission(context, str) != 0) {
                        return null;
                    }
                }
                int Y8 = AbstractC2829t.Y(strArr.length);
                if (Y8 < 16) {
                    Y8 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(Y8);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new com.bumptech.glide.f(linkedHashMap, 5);
            case 2:
                String str3 = (String) obj;
                G7.j.e(context, "context");
                G7.j.e(str3, "input");
                if (I.h.checkSelfPermission(context, str3) == 0) {
                    return new com.bumptech.glide.f(Boolean.TRUE, 5);
                }
                return null;
            default:
                return super.b(context, obj);
        }
    }

    @Override // i.AbstractC2330a
    public final Object c(int i9, Intent intent) {
        boolean z8;
        switch (this.f4719a) {
            case 0:
                return new C2310a(i9, intent);
            case 1:
                C2825p c2825p = C2825p.b;
                if (i9 == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i10 : intArrayExtra) {
                            if (i10 == 0) {
                                z8 = true;
                            } else {
                                z8 = false;
                            }
                            arrayList.add(Boolean.valueOf(z8));
                        }
                        ArrayList z9 = AbstractC2815f.z(stringArrayExtra);
                        Iterator it = z9.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList2 = new ArrayList(Math.min(AbstractC2818i.E(z9, 10), AbstractC2818i.E(arrayList, 10)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList2.add(new C2720i(it.next(), it2.next()));
                        }
                        return AbstractC2829t.b0(arrayList2);
                    }
                    return c2825p;
                }
                return c2825p;
            case 2:
                if (intent != null && i9 == -1) {
                    int[] intArrayExtra2 = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z10 = false;
                    if (intArrayExtra2 != null) {
                        int length = intArrayExtra2.length;
                        int i11 = 0;
                        while (true) {
                            if (i11 < length) {
                                if (intArrayExtra2[i11] == 0) {
                                    z10 = true;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z10);
                }
                return Boolean.FALSE;
            case 3:
                return new C2310a(i9, intent);
            default:
                return new C2310a(i9, intent);
        }
    }
}
