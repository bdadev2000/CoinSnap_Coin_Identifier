package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
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
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4366a;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f4369e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f4370f;

    /* renamed from: g, reason: collision with root package name */
    public PendingIntent f4371g;

    /* renamed from: h, reason: collision with root package name */
    public IconCompat f4372h;

    /* renamed from: i, reason: collision with root package name */
    public int f4373i;

    /* renamed from: j, reason: collision with root package name */
    public int f4374j;
    public B1.f l;

    /* renamed from: n, reason: collision with root package name */
    public Bundle f4376n;

    /* renamed from: q, reason: collision with root package name */
    public String f4379q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f4380r;

    /* renamed from: s, reason: collision with root package name */
    public final Notification f4381s;

    /* renamed from: t, reason: collision with root package name */
    public final ArrayList f4382t;
    public final ArrayList b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4367c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f4368d = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public boolean f4375k = true;
    public boolean m = false;

    /* renamed from: o, reason: collision with root package name */
    public int f4377o = 0;

    /* renamed from: p, reason: collision with root package name */
    public int f4378p = 0;

    public O(Context context, String str) {
        Notification notification = new Notification();
        this.f4381s = notification;
        this.f4366a = context;
        this.f4379q = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.f4374j = 0;
        this.f4382t = new ArrayList();
        this.f4380r = true;
    }

    public static CharSequence b(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        if (charSequence.length() > 5120) {
            return charSequence.subSequence(0, 5120);
        }
        return charSequence;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [b1.h, java.lang.Object] */
    public final Notification a() {
        boolean z8;
        boolean z9;
        boolean z10;
        Icon g9;
        String str;
        String str2;
        ArrayList arrayList;
        b1.h hVar;
        Notification build;
        Bundle extras;
        int i9;
        Bundle bundle;
        ArrayList arrayList2;
        Bundle[] bundleArr;
        String str3;
        String str4;
        b1.h hVar2;
        ArrayList arrayList3;
        int i10;
        ArrayList arrayList4;
        Icon icon;
        Bundle bundle2;
        int i11;
        ?? obj = new Object();
        new ArrayList();
        obj.f5272f = new Bundle();
        obj.f5271d = this;
        Context context = this.f4366a;
        obj.b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            obj.f5270c = U.a(context, this.f4379q);
        } else {
            obj.f5270c = new Notification.Builder(this.f4366a);
        }
        Notification notification = this.f4381s;
        Notification.Builder lights = ((Notification.Builder) obj.f5270c).setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z11 = true;
        if ((notification.flags & 2) != 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z8);
        if ((notification.flags & 8) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z9);
        if ((notification.flags & 16) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z10).setDefaults(notification.defaults).setContentTitle(this.f4369e).setContentText(this.f4370f).setContentInfo(null).setContentIntent(this.f4371g).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z11 = false;
        }
        deleteIntent.setFullScreenIntent(null, z11).setNumber(this.f4373i).setProgress(0, 0, false);
        Notification.Builder builder = (Notification.Builder) obj.f5270c;
        IconCompat iconCompat = this.f4372h;
        if (iconCompat == null) {
            g9 = null;
        } else {
            g9 = M.c.g(iconCompat, context);
        }
        S.b(builder, g9);
        ((Notification.Builder) obj.f5270c).setSubText(null).setUsesChronometer(false).setPriority(this.f4374j);
        Iterator it = this.b.iterator();
        while (true) {
            str = "android.support.allowGeneratedReplies";
            str2 = "";
            if (!it.hasNext()) {
                break;
            }
            C0423y c0423y = (C0423y) it.next();
            if (c0423y.b == null && (i11 = c0423y.f4450h) != 0) {
                c0423y.b = IconCompat.b(i11, "");
            }
            IconCompat iconCompat2 = c0423y.b;
            if (iconCompat2 != null) {
                icon = M.c.g(iconCompat2, null);
            } else {
                icon = null;
            }
            Notification.Action.Builder a6 = S.a(icon, c0423y.f4451i, c0423y.f4452j);
            q0[] q0VarArr = c0423y.f4445c;
            if (q0VarArr != null) {
                int length = q0VarArr.length;
                RemoteInput[] remoteInputArr = new RemoteInput[length];
                for (int i12 = 0; i12 < q0VarArr.length; i12++) {
                    remoteInputArr[i12] = q0.a(q0VarArr[i12]);
                }
                for (int i13 = 0; i13 < length; i13++) {
                    P.c(a6, remoteInputArr[i13]);
                }
            }
            Bundle bundle3 = c0423y.f4444a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z12 = c0423y.f4446d;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z12);
            int i14 = Build.VERSION.SDK_INT;
            T.a(a6, z12);
            int i15 = c0423y.f4448f;
            bundle2.putInt("android.support.action.semanticAction", i15);
            if (i14 >= 28) {
                V.b(a6, i15);
            }
            if (i14 >= 29) {
                W.c(a6, c0423y.f4449g);
            }
            if (i14 >= 31) {
                X.a(a6, c0423y.f4453k);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c0423y.f4447e);
            P.b(a6, bundle2);
            P.a((Notification.Builder) obj.f5270c, P.d(a6));
        }
        Bundle bundle4 = this.f4376n;
        if (bundle4 != null) {
            ((Bundle) obj.f5272f).putAll(bundle4);
        }
        int i16 = Build.VERSION.SDK_INT;
        ((Notification.Builder) obj.f5270c).setShowWhen(this.f4375k);
        P.i((Notification.Builder) obj.f5270c, this.m);
        P.g((Notification.Builder) obj.f5270c, null);
        P.j((Notification.Builder) obj.f5270c, null);
        P.h((Notification.Builder) obj.f5270c, false);
        Q.b((Notification.Builder) obj.f5270c, null);
        Q.c((Notification.Builder) obj.f5270c, this.f4377o);
        Q.f((Notification.Builder) obj.f5270c, this.f4378p);
        Q.d((Notification.Builder) obj.f5270c, null);
        Q.e((Notification.Builder) obj.f5270c, notification.sound, notification.audioAttributes);
        ArrayList arrayList5 = this.f4382t;
        ArrayList arrayList6 = this.f4367c;
        if (i16 < 28) {
            if (arrayList6 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList6.size());
                Iterator it2 = arrayList6.iterator();
                while (it2.hasNext()) {
                    m0 m0Var = (m0) it2.next();
                    String str5 = m0Var.f4412c;
                    if (str5 == null) {
                        CharSequence charSequence = m0Var.f4411a;
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
                if (arrayList5 == null) {
                    arrayList5 = arrayList4;
                } else {
                    x.c cVar = new x.c(arrayList5.size() + arrayList4.size());
                    cVar.addAll(arrayList4);
                    cVar.addAll(arrayList5);
                    arrayList5 = new ArrayList(cVar);
                }
            }
        }
        if (arrayList5 != null && !arrayList5.isEmpty()) {
            Iterator it3 = arrayList5.iterator();
            while (it3.hasNext()) {
                Q.a((Notification.Builder) obj.f5270c, (String) it3.next());
            }
        }
        ArrayList arrayList7 = this.f4368d;
        if (arrayList7.size() > 0) {
            if (this.f4376n == null) {
                this.f4376n = new Bundle();
            }
            Bundle bundle5 = this.f4376n.getBundle("android.car.EXTENSIONS");
            if (bundle5 == null) {
                bundle5 = new Bundle();
            }
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i17 = 0;
            b1.h hVar3 = obj;
            while (i17 < arrayList7.size()) {
                String num = Integer.toString(i17);
                C0423y c0423y2 = (C0423y) arrayList7.get(i17);
                Bundle bundle8 = new Bundle();
                if (c0423y2.b == null && (i10 = c0423y2.f4450h) != 0) {
                    c0423y2.b = IconCompat.b(i10, str2);
                }
                IconCompat iconCompat3 = c0423y2.b;
                if (iconCompat3 != null) {
                    i9 = iconCompat3.c();
                } else {
                    i9 = 0;
                }
                bundle8.putInt(RewardPlus.ICON, i9);
                bundle8.putCharSequence(CampaignEx.JSON_KEY_TITLE, c0423y2.f4451i);
                bundle8.putParcelable("actionIntent", c0423y2.f4452j);
                Bundle bundle9 = c0423y2.f4444a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean(str, c0423y2.f4446d);
                bundle8.putBundle("extras", bundle);
                q0[] q0VarArr2 = c0423y2.f4445c;
                if (q0VarArr2 == null) {
                    hVar2 = hVar3;
                    arrayList2 = arrayList7;
                    arrayList3 = arrayList6;
                    str3 = str;
                    str4 = str2;
                    bundleArr = null;
                } else {
                    arrayList2 = arrayList7;
                    bundleArr = new Bundle[q0VarArr2.length];
                    str3 = str;
                    str4 = str2;
                    int i18 = 0;
                    b1.h hVar4 = hVar3;
                    while (i18 < q0VarArr2.length) {
                        q0 q0Var = q0VarArr2[i18];
                        q0[] q0VarArr3 = q0VarArr2;
                        Bundle bundle10 = new Bundle();
                        ArrayList arrayList8 = arrayList6;
                        b1.h hVar5 = hVar4;
                        bundle10.putString("resultKey", q0Var.f4424a);
                        bundle10.putCharSequence("label", q0Var.b);
                        bundle10.putCharSequenceArray("choices", q0Var.f4425c);
                        bundle10.putBoolean("allowFreeFormInput", q0Var.f4426d);
                        bundle10.putBundle("extras", q0Var.f4428f);
                        Set set = q0Var.f4429g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList9 = new ArrayList<>(set.size());
                            Iterator it4 = set.iterator();
                            while (it4.hasNext()) {
                                arrayList9.add((String) it4.next());
                            }
                            bundle10.putStringArrayList("allowedDataTypes", arrayList9);
                        }
                        bundleArr[i18] = bundle10;
                        i18++;
                        q0VarArr2 = q0VarArr3;
                        arrayList6 = arrayList8;
                        hVar4 = hVar5;
                    }
                    hVar2 = hVar4;
                    arrayList3 = arrayList6;
                }
                bundle8.putParcelableArray("remoteInputs", bundleArr);
                bundle8.putBoolean("showsUserInterface", c0423y2.f4447e);
                bundle8.putInt("semanticAction", c0423y2.f4448f);
                bundle7.putBundle(num, bundle8);
                i17++;
                arrayList7 = arrayList2;
                str = str3;
                str2 = str4;
                arrayList6 = arrayList3;
                hVar3 = hVar2;
            }
            b1.h hVar6 = hVar3;
            arrayList = arrayList6;
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (this.f4376n == null) {
                this.f4376n = new Bundle();
            }
            this.f4376n.putBundle("android.car.EXTENSIONS", bundle5);
            b1.h hVar7 = hVar6;
            ((Bundle) hVar7.f5272f).putBundle("android.car.EXTENSIONS", bundle6);
            hVar = hVar7;
        } else {
            arrayList = arrayList6;
            hVar = obj;
        }
        int i19 = Build.VERSION.SDK_INT;
        ((Notification.Builder) hVar.f5270c).setExtras(this.f4376n);
        T.e((Notification.Builder) hVar.f5270c, null);
        if (i19 >= 26) {
            U.b((Notification.Builder) hVar.f5270c, 0);
            U.e((Notification.Builder) hVar.f5270c, null);
            U.f((Notification.Builder) hVar.f5270c, null);
            U.g((Notification.Builder) hVar.f5270c, 0L);
            U.d((Notification.Builder) hVar.f5270c, 0);
            if (!TextUtils.isEmpty(this.f4379q)) {
                ((Notification.Builder) hVar.f5270c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i19 >= 28) {
            Iterator it5 = arrayList.iterator();
            while (it5.hasNext()) {
                m0 m0Var2 = (m0) it5.next();
                Notification.Builder builder2 = (Notification.Builder) hVar.f5270c;
                m0Var2.getClass();
                V.a(builder2, l0.b(m0Var2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            W.a((Notification.Builder) hVar.f5270c, this.f4380r);
            W.b((Notification.Builder) hVar.f5270c, null);
        }
        O o3 = (O) hVar.f5271d;
        B1.f fVar = o3.l;
        if (fVar != null) {
            fVar.e(hVar);
        }
        int i20 = Build.VERSION.SDK_INT;
        Notification.Builder builder3 = (Notification.Builder) hVar.f5270c;
        if (i20 >= 26) {
            build = builder3.build();
        } else {
            build = builder3.build();
        }
        if (fVar != null) {
            o3.l.getClass();
        }
        if (fVar != null && (extras = NotificationCompat.getExtras(build)) != null) {
            fVar.d(extras);
        }
        return build;
    }

    public final void c(boolean z8) {
        Notification notification = this.f4381s;
        if (z8) {
            notification.flags |= 16;
        } else {
            notification.flags &= -17;
        }
    }

    public final void d(B1.f fVar) {
        if (this.l != fVar) {
            this.l = fVar;
            if (((O) fVar.f273c) != this) {
                fVar.f273c = this;
                d(fVar);
            }
        }
    }
}
