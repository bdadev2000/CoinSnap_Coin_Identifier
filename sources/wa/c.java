package wa;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzjf;
import com.google.android.gms.measurement.internal.zzlh;
import com.google.common.collect.b1;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class c {
    public final cc.c a;

    /* renamed from: b, reason: collision with root package name */
    public final String f26961b = "frc";

    /* renamed from: c, reason: collision with root package name */
    public Integer f26962c = null;

    public c(cc.c cVar) {
        this.a = cVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.a.equals(str) && bVar2.f26956b.equals(bVar.f26956b)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        za.c cVar = (za.c) ((za.b) this.a.get());
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : cVar.a.getConditionalUserProperties(this.f26961b, "")) {
            b1 b1Var = ab.a.a;
            Preconditions.checkNotNull(bundle);
            za.a aVar = new za.a();
            aVar.a = (String) Preconditions.checkNotNull((String) zzjf.zza(bundle, "origin", String.class, null));
            aVar.f28699b = (String) Preconditions.checkNotNull((String) zzjf.zza(bundle, "name", String.class, null));
            aVar.f28700c = zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            aVar.f28701d = (String) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            aVar.f28702e = ((Long) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            aVar.f28703f = (String) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            aVar.f28704g = (Bundle) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            aVar.f28705h = (String) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            aVar.f28706i = (Bundle) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            aVar.f28707j = ((Long) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            aVar.f28708k = (String) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            aVar.f28709l = (Bundle) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            aVar.f28711n = ((Boolean) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            aVar.f28710m = ((Long) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            aVar.f28712o = ((Long) zzjf.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(aVar);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        String str;
        boolean z10;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        d();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            String str6 = "";
            if (it.hasNext()) {
                Map map = (Map) it.next();
                String[] strArr = b.f26954g;
                ArrayList arrayList3 = new ArrayList();
                String[] strArr2 = b.f26954g;
                for (int i10 = 0; i10 < 5; i10++) {
                    String str7 = strArr2[i10];
                    if (!map.containsKey(str7)) {
                        arrayList3.add(str7);
                    }
                }
                if (arrayList3.isEmpty()) {
                    try {
                        Date parse = b.f26955h.parse((String) map.get("experimentStartTime"));
                        long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                        long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                        String str8 = (String) map.get("experimentId");
                        String str9 = (String) map.get("variantId");
                        if (map.containsKey("triggerEvent")) {
                            str6 = (String) map.get("triggerEvent");
                        }
                        arrayList2.add(new b(str8, str9, str6, parse, parseLong, parseLong2));
                    } catch (NumberFormatException e2) {
                        throw new a("Could not process experiment: one of the durations could not be converted into a long.", e2);
                    } catch (ParseException e10) {
                        throw new a("Could not process experiment: parsing experiment start time failed.", e10);
                    }
                } else {
                    throw new a(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                }
            } else {
                boolean isEmpty = arrayList2.isEmpty();
                cc.c cVar = this.a;
                if (isEmpty) {
                    d();
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        ((za.c) ((za.b) cVar.get())).a.clearConditionalUserProperty(((za.a) it2.next()).f28699b, null, null);
                    }
                    return;
                }
                d();
                ArrayList b3 = b();
                ArrayList arrayList4 = new ArrayList();
                Iterator it3 = b3.iterator();
                while (it3.hasNext()) {
                    za.a aVar = (za.a) it3.next();
                    String[] strArr3 = b.f26954g;
                    String str10 = aVar.f28701d;
                    if (str10 == null) {
                        str5 = "";
                    } else {
                        str5 = str10;
                    }
                    arrayList4.add(new b(aVar.f28699b, String.valueOf(aVar.f28700c), str5, new Date(aVar.f28710m), aVar.f28702e, aVar.f28707j));
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext = it4.hasNext();
                    str = this.f26961b;
                    if (!hasNext) {
                        break;
                    }
                    b bVar = (b) it4.next();
                    if (!a(arrayList2, bVar)) {
                        arrayList5.add(bVar.a(str));
                    }
                }
                Iterator it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    ((za.c) ((za.b) cVar.get())).a.clearConditionalUserProperty(((za.a) it5.next()).f28699b, null, null);
                }
                ArrayList arrayList6 = new ArrayList();
                Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    b bVar2 = (b) it6.next();
                    if (!a(arrayList4, bVar2)) {
                        arrayList6.add(bVar2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                if (this.f26962c == null) {
                    this.f26962c = Integer.valueOf(((za.c) ((za.b) cVar.get())).a.getMaxUserProperties(str));
                }
                int intValue = this.f26962c.intValue();
                Iterator it7 = arrayList6.iterator();
                while (it7.hasNext()) {
                    b bVar3 = (b) it7.next();
                    while (arrayDeque.size() >= intValue) {
                        ((za.c) ((za.b) cVar.get())).a.clearConditionalUserProperty(((za.a) arrayDeque.pollFirst()).f28699b, null, null);
                    }
                    za.a a = bVar3.a(str);
                    za.c cVar2 = (za.c) ((za.b) cVar.get());
                    cVar2.getClass();
                    b1 b1Var = ab.a.a;
                    String str11 = a.a;
                    if (str11 != null && !str11.isEmpty() && (((obj = a.f28700c) == null || zzlh.zza(obj) != null) && ab.a.d(str11) && ab.a.b(str11, a.f28699b) && (((str2 = a.f28708k) == null || (ab.a.a(a.f28709l, str2) && ab.a.c(a.f28709l, str11, a.f28708k))) && (((str3 = a.f28705h) == null || (ab.a.a(a.f28706i, str3) && ab.a.c(a.f28706i, str11, a.f28705h))) && ((str4 = a.f28703f) == null || (ab.a.a(a.f28704g, str4) && ab.a.c(a.f28704g, str11, a.f28703f))))))) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        Bundle bundle = new Bundle();
                        String str12 = a.a;
                        if (str12 != null) {
                            bundle.putString("origin", str12);
                        }
                        String str13 = a.f28699b;
                        if (str13 != null) {
                            bundle.putString("name", str13);
                        }
                        Object obj2 = a.f28700c;
                        if (obj2 != null) {
                            zzjf.zza(bundle, obj2);
                        }
                        String str14 = a.f28701d;
                        if (str14 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str14);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, a.f28702e);
                        String str15 = a.f28703f;
                        if (str15 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str15);
                        }
                        Bundle bundle2 = a.f28704g;
                        if (bundle2 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                        }
                        String str16 = a.f28705h;
                        if (str16 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str16);
                        }
                        Bundle bundle3 = a.f28706i;
                        if (bundle3 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, a.f28707j);
                        String str17 = a.f28708k;
                        if (str17 != null) {
                            bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str17);
                        }
                        Bundle bundle4 = a.f28709l;
                        if (bundle4 != null) {
                            bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                        }
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, a.f28710m);
                        bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, a.f28711n);
                        bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, a.f28712o);
                        cVar2.a.setConditionalUserProperty(bundle);
                    }
                    arrayDeque.offer(a);
                }
                return;
            }
        }
    }

    public final void d() {
        if (this.a.get() != null) {
        } else {
            throw new a("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
