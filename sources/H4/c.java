package h4;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzik;
import com.google.android.gms.measurement.internal.zzkq;
import d4.u;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import k4.C2432a;
import k4.C2434c;
import k4.InterfaceC2433b;
import l4.AbstractC2445b;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final N4.b f20596a;
    public final String b = "frc";

    /* renamed from: c, reason: collision with root package name */
    public Integer f20597c = null;

    public c(N4.b bVar) {
        this.f20596a = bVar;
    }

    public static boolean a(ArrayList arrayList, b bVar) {
        String str = bVar.f20591a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b bVar2 = (b) it.next();
            if (bVar2.f20591a.equals(str) && bVar2.b.equals(bVar.b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, k4.a] */
    public final ArrayList b() {
        C2434c c2434c = (C2434c) ((InterfaceC2433b) this.f20596a.get());
        c2434c.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : c2434c.f21472a.getConditionalUserProperties(this.b, "")) {
            u uVar = AbstractC2445b.f21567a;
            Preconditions.checkNotNull(bundle);
            ?? obj = new Object();
            obj.f21459a = (String) Preconditions.checkNotNull((String) zzik.zza(bundle, "origin", String.class, null));
            obj.b = (String) Preconditions.checkNotNull((String) zzik.zza(bundle, "name", String.class, null));
            obj.f21460c = zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.VALUE, Object.class, null);
            obj.f21461d = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, String.class, null);
            obj.f21462e = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, Long.class, 0L)).longValue();
            obj.f21463f = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, String.class, null);
            obj.f21464g = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, Bundle.class, null);
            obj.f21465h = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, String.class, null);
            obj.f21466i = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, Bundle.class, null);
            obj.f21467j = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, Long.class, 0L)).longValue();
            obj.f21468k = (String) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, String.class, null);
            obj.l = (Bundle) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, Bundle.class, null);
            obj.f21469n = ((Boolean) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            obj.m = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, Long.class, 0L)).longValue();
            obj.f21470o = ((Long) zzik.zza(bundle, AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    public final void c(ArrayList arrayList) {
        String str;
        Object obj;
        String str2;
        String str3;
        String str4;
        String str5;
        N4.b bVar = this.f20596a;
        if (bVar.get() != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (true) {
                String str6 = "";
                if (it.hasNext()) {
                    Map map = (Map) it.next();
                    String[] strArr = b.f20589g;
                    ArrayList arrayList3 = new ArrayList();
                    String[] strArr2 = b.f20589g;
                    for (int i9 = 0; i9 < 5; i9++) {
                        String str7 = strArr2[i9];
                        if (!map.containsKey(str7)) {
                            arrayList3.add(str7);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        try {
                            Date parse = b.f20590h.parse((String) map.get("experimentStartTime"));
                            long parseLong = Long.parseLong((String) map.get("triggerTimeoutMillis"));
                            long parseLong2 = Long.parseLong((String) map.get("timeToLiveMillis"));
                            String str8 = (String) map.get("experimentId");
                            String str9 = (String) map.get("variantId");
                            if (map.containsKey("triggerEvent")) {
                                str6 = (String) map.get("triggerEvent");
                            }
                            arrayList2.add(new b(str8, str9, str6, parse, parseLong, parseLong2));
                        } catch (NumberFormatException e4) {
                            throw new Exception("Could not process experiment: one of the durations could not be converted into a long.", e4);
                        } catch (ParseException e9) {
                            throw new Exception("Could not process experiment: parsing experiment start time failed.", e9);
                        }
                    } else {
                        throw new Exception(String.format("The following keys are missing from the experiment info map: %s", arrayList3));
                    }
                } else {
                    if (arrayList2.isEmpty()) {
                        if (bVar.get() != null) {
                            Iterator it2 = b().iterator();
                            while (it2.hasNext()) {
                                ((C2434c) ((InterfaceC2433b) bVar.get())).f21472a.clearConditionalUserProperty(((C2432a) it2.next()).b, null, null);
                            }
                            return;
                        }
                        throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    if (bVar.get() != null) {
                        ArrayList b = b();
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it3 = b.iterator();
                        while (it3.hasNext()) {
                            C2432a c2432a = (C2432a) it3.next();
                            String[] strArr3 = b.f20589g;
                            String str10 = c2432a.f21461d;
                            if (str10 != null) {
                                str5 = str10;
                            } else {
                                str5 = str6;
                            }
                            arrayList4.add(new b(c2432a.b, String.valueOf(c2432a.f21460c), str5, new Date(c2432a.m), c2432a.f21462e, c2432a.f21467j));
                            str6 = str6;
                        }
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it4 = arrayList4.iterator();
                        while (true) {
                            boolean hasNext = it4.hasNext();
                            str = this.b;
                            if (!hasNext) {
                                break;
                            }
                            b bVar2 = (b) it4.next();
                            if (!a(arrayList2, bVar2)) {
                                arrayList5.add(bVar2.a(str));
                            }
                        }
                        Iterator it5 = arrayList5.iterator();
                        while (it5.hasNext()) {
                            ((C2434c) ((InterfaceC2433b) bVar.get())).f21472a.clearConditionalUserProperty(((C2432a) it5.next()).b, null, null);
                        }
                        ArrayList arrayList6 = new ArrayList();
                        Iterator it6 = arrayList2.iterator();
                        while (it6.hasNext()) {
                            b bVar3 = (b) it6.next();
                            if (!a(arrayList4, bVar3)) {
                                arrayList6.add(bVar3);
                            }
                        }
                        ArrayDeque arrayDeque = new ArrayDeque(b());
                        if (this.f20597c == null) {
                            this.f20597c = Integer.valueOf(((C2434c) ((InterfaceC2433b) bVar.get())).f21472a.getMaxUserProperties(str));
                        }
                        int intValue = this.f20597c.intValue();
                        Iterator it7 = arrayList6.iterator();
                        while (it7.hasNext()) {
                            b bVar4 = (b) it7.next();
                            while (arrayDeque.size() >= intValue) {
                                ((C2434c) ((InterfaceC2433b) bVar.get())).f21472a.clearConditionalUserProperty(((C2432a) arrayDeque.pollFirst()).b, null, null);
                            }
                            C2432a a6 = bVar4.a(str);
                            C2434c c2434c = (C2434c) ((InterfaceC2433b) bVar.get());
                            c2434c.getClass();
                            u uVar = AbstractC2445b.f21567a;
                            String str11 = a6.f21459a;
                            if (str11 != null && !str11.isEmpty() && (((obj = a6.f21460c) == null || zzkq.zza(obj) != null) && AbstractC2445b.d(str11) && AbstractC2445b.b(str11, a6.b) && (((str2 = a6.f21468k) == null || (AbstractC2445b.a(str2, a6.l) && AbstractC2445b.c(str11, a6.f21468k, a6.l))) && (((str3 = a6.f21465h) == null || (AbstractC2445b.a(str3, a6.f21466i) && AbstractC2445b.c(str11, a6.f21465h, a6.f21466i))) && ((str4 = a6.f21463f) == null || (AbstractC2445b.a(str4, a6.f21464g) && AbstractC2445b.c(str11, a6.f21463f, a6.f21464g))))))) {
                                Bundle bundle = new Bundle();
                                String str12 = a6.f21459a;
                                if (str12 != null) {
                                    bundle.putString("origin", str12);
                                }
                                String str13 = a6.b;
                                if (str13 != null) {
                                    bundle.putString("name", str13);
                                }
                                Object obj2 = a6.f21460c;
                                if (obj2 != null) {
                                    zzik.zza(bundle, obj2);
                                }
                                String str14 = a6.f21461d;
                                if (str14 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME, str14);
                                }
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT, a6.f21462e);
                                String str15 = a6.f21463f;
                                if (str15 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_NAME, str15);
                                }
                                Bundle bundle2 = a6.f21464g;
                                if (bundle2 != null) {
                                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TIMED_OUT_EVENT_PARAMS, bundle2);
                                }
                                String str16 = a6.f21465h;
                                if (str16 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_NAME, str16);
                                }
                                Bundle bundle3 = a6.f21466i;
                                if (bundle3 != null) {
                                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_EVENT_PARAMS, bundle3);
                                }
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE, a6.f21467j);
                                String str17 = a6.f21468k;
                                if (str17 != null) {
                                    bundle.putString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME, str17);
                                }
                                Bundle bundle4 = a6.l;
                                if (bundle4 != null) {
                                    bundle.putBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS, bundle4);
                                }
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP, a6.m);
                                bundle.putBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE, a6.f21469n);
                                bundle.putLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGERED_TIMESTAMP, a6.f21470o);
                                c2434c.f21472a.setConditionalUserProperty(bundle);
                            }
                            arrayDeque.offer(a6);
                        }
                        return;
                    }
                    throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
            }
        } else {
            throw new Exception("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }
}
