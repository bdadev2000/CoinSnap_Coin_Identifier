package androidx.core.app;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class c1 {
    public final Context a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f1185b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f1186c;

    /* renamed from: d, reason: collision with root package name */
    public final Bundle f1187d;

    public c1(s0 s0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        Icon g10;
        String str;
        String str2;
        ArrayList arrayList;
        int i10;
        Bundle bundle;
        ArrayList arrayList2;
        String str3;
        String str4;
        ArrayList arrayList3;
        Bundle[] bundleArr;
        int i11;
        Icon icon;
        Bundle bundle2;
        int i12;
        c1 c1Var = this;
        new ArrayList();
        c1Var.f1187d = new Bundle();
        c1Var.f1186c = s0Var;
        Context context = s0Var.a;
        c1Var.a = context;
        if (Build.VERSION.SDK_INT >= 26) {
            c1Var.f1185b = y0.a(context, s0Var.f1240q);
        } else {
            c1Var.f1185b = new Notification.Builder(s0Var.a);
        }
        Notification notification = s0Var.f1242s;
        ArrayList arrayList4 = null;
        Notification.Builder lights = c1Var.f1185b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        int i13 = 0;
        if ((notification.flags & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z10);
        if ((notification.flags & 8) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z11);
        if ((notification.flags & 16) != 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        onlyAlertOnce.setAutoCancel(z12).setDefaults(notification.defaults).setContentTitle(s0Var.f1228e).setContentText(s0Var.f1229f).setContentInfo(null).setContentIntent(s0Var.f1230g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(s0Var.f1232i).setProgress(0, 0, false);
        Notification.Builder builder = c1Var.f1185b;
        IconCompat iconCompat = s0Var.f1231h;
        if (iconCompat == null) {
            g10 = null;
        } else {
            g10 = h0.c.g(iconCompat, context);
        }
        w0.b(builder, g10);
        c1Var.f1185b.setSubText(null).setUsesChronometer(false).setPriority(s0Var.f1233j);
        Iterator it = s0Var.f1225b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            b0 b0Var = (b0) it.next();
            if (b0Var.f1175b == null && (i12 = b0Var.f1181h) != 0) {
                b0Var.f1175b = IconCompat.b("", i12);
            }
            IconCompat iconCompat2 = b0Var.f1175b;
            if (iconCompat2 != null) {
                icon = h0.c.g(iconCompat2, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder a = w0.a(icon, b0Var.f1182i, b0Var.f1183j);
            x1[] x1VarArr = b0Var.f1176c;
            if (x1VarArr != null) {
                int length = x1VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i14 = 0; i14 < x1VarArr.length; i14++) {
                    remoteInputArr[i14] = x1.a(x1VarArr[i14]);
                }
                for (int i15 = 0; i15 < length; i15++) {
                    u0.c(a, remoteInputArr[i15]);
                }
            }
            Bundle bundle3 = b0Var.a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z13 = b0Var.f1177d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z13);
            int i16 = Build.VERSION.SDK_INT;
            x0.a(a, z13);
            int i17 = b0Var.f1179f;
            bundle2.putInt("android.support.action.semanticAction", i17);
            if (i16 >= 28) {
                z0.b(a, i17);
            }
            if (i16 >= 29) {
                a1.c(a, b0Var.f1180g);
            }
            if (i16 >= 31) {
                b1.a(a, b0Var.f1184k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", b0Var.f1178e);
            u0.b(a, bundle2);
            u0.a(c1Var.f1185b, u0.d(a));
        }
        Bundle bundle4 = s0Var.f1237n;
        if (bundle4 != null) {
            c1Var.f1187d.putAll(bundle4);
        }
        int i18 = Build.VERSION.SDK_INT;
        c1Var.f1185b.setShowWhen(s0Var.f1234k);
        u0.i(c1Var.f1185b, s0Var.f1236m);
        u0.g(c1Var.f1185b, null);
        u0.j(c1Var.f1185b, null);
        u0.h(c1Var.f1185b, false);
        v0.b(c1Var.f1185b, null);
        v0.c(c1Var.f1185b, s0Var.f1238o);
        v0.f(c1Var.f1185b, s0Var.f1239p);
        v0.d(c1Var.f1185b, null);
        v0.e(c1Var.f1185b, notification.sound, notification.audioAttributes);
        ArrayList arrayList5 = s0Var.f1226c;
        ArrayList arrayList6 = s0Var.f1243t;
        if (i18 < 28) {
            if (arrayList5 != null) {
                arrayList4 = new ArrayList(arrayList5.size());
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    t1 t1Var = (t1) it2.next();
                    String str5 = t1Var.f1253c;
                    if (str5 == null) {
                        CharSequence charSequence = t1Var.a;
                        if (charSequence == null) {
                            str5 = "";
                        } else {
                            str5 = "name:" + ((Object) charSequence);
                        }
                    }
                    arrayList4.add(str5);
                }
            }
            if (arrayList4 != null) {
                if (arrayList6 == null) {
                    arrayList6 = arrayList4;
                } else {
                    r.c cVar = new r.c(arrayList6.size() + arrayList4.size());
                    cVar.addAll(arrayList4);
                    cVar.addAll(arrayList6);
                    arrayList6 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList6 != null && !arrayList6.isEmpty()) {
            Iterator it3 = arrayList6.iterator();
            while (it3.hasNext()) {
                v0.a(c1Var.f1185b, (String) it3.next());
            }
        }
        ArrayList arrayList7 = s0Var.f1227d;
        if (arrayList7.size() > 0) {
            if (s0Var.f1237n == null) {
                s0Var.f1237n = new Bundle();
            }
            Bundle bundle5 = s0Var.f1237n.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            while (i13 < arrayList7.size()) {
                String num = Integer.toString(i13);
                b0 b0Var2 = (b0) arrayList7.get(i13);
                Bundle bundle8 = new Bundle();
                if (b0Var2.f1175b == null && (i11 = b0Var2.f1181h) != 0) {
                    b0Var2.f1175b = IconCompat.b(str2, i11);
                }
                IconCompat iconCompat3 = b0Var2.f1175b;
                if (iconCompat3 != null) {
                    i10 = iconCompat3.c();
                } else {
                    i10 = 0;
                }
                bundle8.putInt(RewardPlus.ICON, i10);
                bundle8.putCharSequence(CampaignEx.JSON_KEY_TITLE, b0Var2.f1182i);
                bundle8.putParcelable("actionIntent", b0Var2.f1183j);
                Bundle bundle9 = b0Var2.a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, b0Var2.f1177d);
                bundle8.putBundle("extras", bundle);
                x1[] x1VarArr2 = b0Var2.f1176c;
                if (x1VarArr2 == null) {
                    bundleArr = null;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList5;
                    str3 = str;
                    str4 = str2;
                } else {
                    arrayList2 = arrayList7;
                    Bundle[] bundleArr2 = new Bundle[x1VarArr2.length];
                    str3 = str;
                    int i19 = 0;
                    str4 = str2;
                    while (i19 < x1VarArr2.length) {
                        x1 x1Var = x1VarArr2[i19];
                        x1[] x1VarArr3 = x1VarArr2;
                        Bundle bundle10 = new Bundle();
                        ArrayList arrayList8 = arrayList5;
                        bundle10.putString("resultKey", x1Var.a);
                        bundle10.putCharSequence("label", x1Var.f1270b);
                        bundle10.putCharSequenceArray("choices", x1Var.f1271c);
                        bundle10.putBoolean("allowFreeFormInput", x1Var.f1272d);
                        bundle10.putBundle("extras", x1Var.f1274f);
                        Set set = x1Var.f1275g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList9 = new ArrayList<>(set.size());
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add((String) it4.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList9);
                        }
                        bundleArr2[i19] = bundle10;
                        i19++;
                        x1VarArr2 = x1VarArr3;
                        arrayList5 = arrayList8;
                    }
                    arrayList3 = arrayList5;
                    bundleArr = bundleArr2;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", b0Var2.f1178e);
                bundle8.putInt("semanticAction", b0Var2.f1179f);
                bundle7.putBundle(num, bundle8);
                i13++;
                arrayList7 = arrayList2;
                str2 = str4;
                str = str3;
                arrayList5 = arrayList3;
            }
            arrayList = arrayList5;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (s0Var.f1237n == null) {
                s0Var.f1237n = new Bundle();
            }
            s0Var.f1237n.putBundle("android.car.EXTENSIONS", bundle5);
            c1Var = this;
            c1Var.f1187d.putBundle("android.car.EXTENSIONS", bundle6);
        } else {
            arrayList = arrayList5;
        }
        int i20 = Build.VERSION.SDK_INT;
        c1Var.f1185b.setExtras(s0Var.f1237n);
        x0.e(c1Var.f1185b, null);
        if (i20 >= 26) {
            y0.b(c1Var.f1185b, 0);
            y0.e(c1Var.f1185b, null);
            y0.f(c1Var.f1185b, null);
            y0.g(c1Var.f1185b, 0L);
            y0.d(c1Var.f1185b, 0);
            if (!TextUtils.isEmpty(s0Var.f1240q)) {
                c1Var.f1185b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i20 >= 28) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                t1 t1Var2 = (t1) it5.next();
                Notification.Builder builder2 = c1Var.f1185b;
                t1Var2.getClass();
                z0.a(builder2, r1.b(t1Var2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            a1.a(c1Var.f1185b, s0Var.f1241r);
            a1.b(c1Var.f1185b, null);
        }
    }
}
