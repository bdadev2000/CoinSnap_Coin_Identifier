package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.LocusId;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.RemoteViews;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.ArraySet;
import androidx.core.app.NotificationCompat;
import androidx.core.app.Person;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.cooldev.gba.emulator.gameboy.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

@RestrictTo
/* loaded from: classes2.dex */
class NotificationCompatBuilder implements NotificationBuilderWithBuilderAccessor {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18450a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f18451b;

    /* renamed from: c, reason: collision with root package name */
    public final NotificationCompat.Builder f18452c;
    public final Bundle d;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api20Impl {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, Notification.Action action) {
            return builder.addAction(action);
        }

        @DoNotInline
        public static Notification.Action.Builder b(Notification.Action.Builder builder, Bundle bundle) {
            return builder.addExtras(bundle);
        }

        @DoNotInline
        public static Notification.Action.Builder c(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
            return builder.addRemoteInput(remoteInput);
        }

        @DoNotInline
        public static Notification.Action d(Notification.Action.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        public static Notification.Action.Builder e(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(i2, charSequence, pendingIntent);
        }

        @DoNotInline
        public static String f(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static Notification.Builder g(Notification.Builder builder, String str) {
            return builder.setGroup(str);
        }

        @DoNotInline
        public static Notification.Builder h(Notification.Builder builder, boolean z2) {
            return builder.setGroupSummary(z2);
        }

        @DoNotInline
        public static Notification.Builder i(Notification.Builder builder, boolean z2) {
            return builder.setLocalOnly(z2);
        }

        @DoNotInline
        public static Notification.Builder j(Notification.Builder builder, String str) {
            return builder.setSortKey(str);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api21Impl {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.addPerson(str);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, String str) {
            return builder.setCategory(str);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, int i2) {
            return builder.setColor(i2);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, Notification notification) {
            return builder.setPublicVersion(notification);
        }

        @DoNotInline
        public static Notification.Builder e(Notification.Builder builder, Uri uri, Object obj) {
            return builder.setSound(uri, (AudioAttributes) obj);
        }

        @DoNotInline
        public static Notification.Builder f(Notification.Builder builder, int i2) {
            return builder.setVisibility(i2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api23Impl {
        @DoNotInline
        public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
            return new Notification.Action.Builder(icon, charSequence, pendingIntent);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, Icon icon) {
            return builder.setLargeIcon(icon);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, Object obj) {
            return builder.setSmallIcon((Icon) obj);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api24Impl {
        @DoNotInline
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAllowGeneratedReplies(z2);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        @DoNotInline
        public static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        @DoNotInline
        public static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setBadgeIconType(i2);
        }

        @DoNotInline
        public static Notification.Builder c(Notification.Builder builder, boolean z2) {
            return builder.setColorized(z2);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, int i2) {
            return builder.setGroupAlertBehavior(i2);
        }

        @DoNotInline
        public static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        @DoNotInline
        public static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        @DoNotInline
        public static Notification.Builder g(Notification.Builder builder, long j2) {
            return builder.setTimeoutAfter(j2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, android.app.Person person) {
            return builder.addPerson(person);
        }

        @DoNotInline
        public static Notification.Action.Builder b(Notification.Action.Builder builder, int i2) {
            return builder.setSemanticAction(i2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static Notification.Builder a(Notification.Builder builder, boolean z2) {
            return builder.setAllowSystemGeneratedContextualActions(z2);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        @DoNotInline
        public static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z2) {
            return builder.setContextual(z2);
        }

        @DoNotInline
        public static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api31Impl {
        @DoNotInline
        public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
            return builder.setAuthenticationRequired(z2);
        }

        @DoNotInline
        public static Notification.Builder b(Notification.Builder builder, int i2) {
            return builder.setForegroundServiceBehavior(i2);
        }
    }

    public NotificationCompatBuilder(NotificationCompat.Builder builder) {
        ArrayList arrayList;
        Bundle[] bundleArr;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        NotificationCompatBuilder notificationCompatBuilder = this;
        new ArrayList();
        notificationCompatBuilder.d = new Bundle();
        notificationCompatBuilder.f18452c = builder;
        Context context = builder.f18431a;
        notificationCompatBuilder.f18450a = context;
        Notification.Builder a2 = Api26Impl.a(context, builder.f18442n);
        notificationCompatBuilder.f18451b = a2;
        Notification notification = builder.f18444p;
        Bundle[] bundleArr2 = null;
        a2.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(builder.e).setContentText(builder.f18434f).setContentInfo(null).setContentIntent(builder.f18435g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(0).setProgress(0, 0, false);
        IconCompat iconCompat = builder.f18436h;
        Api23Impl.b(a2, iconCompat == null ? null : iconCompat.i(context));
        a2.setSubText(null).setUsesChronometer(false).setPriority(builder.f18437i);
        NotificationCompat.Style style = builder.f18439k;
        if (style instanceof NotificationCompat.CallStyle) {
            NotificationCompat.CallStyle callStyle = (NotificationCompat.CallStyle) style;
            Integer valueOf = Integer.valueOf(ContextCompat.getColor(callStyle.f18447a.f18431a, R.color.call_notification_decline_color));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) callStyle.f18447a.f18431a.getResources().getString(R.string.call_notification_hang_up_action));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(valueOf.intValue()), 0, spannableStringBuilder.length(), 18);
            Context context2 = callStyle.f18447a.f18431a;
            PorterDuff.Mode mode = IconCompat.f18555k;
            context2.getClass();
            NotificationCompat.Action.Builder builder2 = new NotificationCompat.Action.Builder(IconCompat.c(context2.getResources(), context2.getPackageName(), 2131231095), spannableStringBuilder);
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            NotificationCompat.Action action = new NotificationCompat.Action(builder2.f18422a, builder2.f18423b, null, builder2.d, arrayList6.isEmpty() ? null : (RemoteInput[]) arrayList6.toArray(new RemoteInput[arrayList6.size()]), arrayList5.isEmpty() ? null : (RemoteInput[]) arrayList5.toArray(new RemoteInput[arrayList5.size()]), builder2.f18424c, builder2.e, builder2.f18425f, builder2.f18426g, builder2.f18427h);
            action.f18413a.putBoolean("key_action_priority", true);
            ArrayList arrayList7 = new ArrayList(3);
            arrayList7.add(action);
            ArrayList arrayList8 = callStyle.f18447a.f18432b;
            if (arrayList8 != null) {
                Iterator it = arrayList8.iterator();
                int i2 = 2;
                while (it.hasNext()) {
                    NotificationCompat.Action action2 = (NotificationCompat.Action) it.next();
                    if (action2.f18417g) {
                        arrayList7.add(action2);
                    } else if (!action2.f18413a.getBoolean("key_action_priority") && i2 > 1) {
                        arrayList7.add(action2);
                        i2--;
                    }
                }
            }
            Iterator it2 = arrayList7.iterator();
            while (it2.hasNext()) {
                notificationCompatBuilder.b((NotificationCompat.Action) it2.next());
            }
        } else {
            Iterator it3 = builder.f18432b.iterator();
            while (it3.hasNext()) {
                notificationCompatBuilder.b((NotificationCompat.Action) it3.next());
            }
        }
        Bundle bundle = builder.f18441m;
        if (bundle != null) {
            notificationCompatBuilder.d.putAll(bundle);
        }
        int i3 = Build.VERSION.SDK_INT;
        notificationCompatBuilder.f18451b.setShowWhen(builder.f18438j);
        Api20Impl.i(notificationCompatBuilder.f18451b, builder.f18440l);
        Api20Impl.g(notificationCompatBuilder.f18451b, null);
        Api20Impl.j(notificationCompatBuilder.f18451b, null);
        Api20Impl.h(notificationCompatBuilder.f18451b, false);
        Api21Impl.b(notificationCompatBuilder.f18451b, null);
        Api21Impl.c(notificationCompatBuilder.f18451b, 0);
        Api21Impl.f(notificationCompatBuilder.f18451b, 0);
        Api21Impl.d(notificationCompatBuilder.f18451b, null);
        Api21Impl.e(notificationCompatBuilder.f18451b, notification.sound, notification.audioAttributes);
        ArrayList arrayList9 = builder.f18433c;
        ArrayList arrayList10 = builder.f18445q;
        if (i3 < 28) {
            if (arrayList9 == null) {
                arrayList4 = null;
            } else {
                arrayList4 = new ArrayList(arrayList9.size());
                Iterator it4 = arrayList9.iterator();
                while (it4.hasNext()) {
                    Person person = (Person) it4.next();
                    String str = person.f18457c;
                    if (str == null) {
                        CharSequence charSequence = person.f18455a;
                        if (charSequence != null) {
                            str = "name:" + ((Object) charSequence);
                        } else {
                            str = "";
                        }
                    }
                    arrayList4.add(str);
                }
            }
            if (arrayList4 != null) {
                if (arrayList10 == null) {
                    arrayList10 = arrayList4;
                } else {
                    ArraySet arraySet = new ArraySet(arrayList10.size() + arrayList4.size());
                    arraySet.addAll(arrayList4);
                    arraySet.addAll(arrayList10);
                    arrayList10 = new ArrayList(arraySet);
                }
            }
        }
        if (arrayList10 != null && !arrayList10.isEmpty()) {
            Iterator it5 = arrayList10.iterator();
            while (it5.hasNext()) {
                Api21Impl.a(notificationCompatBuilder.f18451b, (String) it5.next());
            }
        }
        ArrayList arrayList11 = builder.d;
        if (arrayList11.size() > 0) {
            if (builder.f18441m == null) {
                builder.f18441m = new Bundle();
            }
            Bundle bundle2 = builder.f18441m.getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            int i4 = 0;
            while (i4 < arrayList11.size()) {
                String num = Integer.toString(i4);
                NotificationCompat.Action action3 = (NotificationCompat.Action) arrayList11.get(i4);
                Bundle bundle5 = new Bundle();
                IconCompat a3 = action3.a();
                bundle5.putInt("icon", a3 != null ? a3.d() : 0);
                bundle5.putCharSequence("title", action3.f18419i);
                bundle5.putParcelable("actionIntent", action3.f18420j);
                Bundle bundle6 = action3.f18413a;
                Bundle bundle7 = bundle6 != null ? new Bundle(bundle6) : new Bundle();
                bundle7.putBoolean("android.support.allowGeneratedReplies", action3.d);
                bundle5.putBundle("extras", bundle7);
                RemoteInput[] remoteInputArr = action3.f18415c;
                if (remoteInputArr == null) {
                    arrayList2 = arrayList11;
                    arrayList3 = arrayList9;
                    bundleArr = bundleArr2;
                } else {
                    bundleArr = new Bundle[remoteInputArr.length];
                    arrayList2 = arrayList11;
                    int i5 = 0;
                    while (i5 < remoteInputArr.length) {
                        RemoteInput remoteInput = remoteInputArr[i5];
                        RemoteInput[] remoteInputArr2 = remoteInputArr;
                        Bundle bundle8 = new Bundle();
                        ArrayList arrayList12 = arrayList9;
                        bundle8.putString("resultKey", remoteInput.f18468a);
                        bundle8.putCharSequence("label", remoteInput.f18469b);
                        bundle8.putCharSequenceArray("choices", remoteInput.f18470c);
                        bundle8.putBoolean("allowFreeFormInput", remoteInput.d);
                        bundle8.putBundle("extras", remoteInput.f18471f);
                        Set set = remoteInput.f18472g;
                        if (set != null && !set.isEmpty()) {
                            ArrayList<String> arrayList13 = new ArrayList<>(set.size());
                            Iterator it6 = set.iterator();
                            while (it6.hasNext()) {
                                arrayList13.add((String) it6.next());
                            }
                            bundle8.putStringArrayList("allowedDataTypes", arrayList13);
                        }
                        bundleArr[i5] = bundle8;
                        i5++;
                        remoteInputArr = remoteInputArr2;
                        arrayList9 = arrayList12;
                    }
                    arrayList3 = arrayList9;
                }
                bundle5.putParcelableArray("remoteInputs", bundleArr);
                bundle5.putBoolean("showsUserInterface", action3.e);
                bundle5.putInt("semanticAction", action3.f18416f);
                bundle4.putBundle(num, bundle5);
                i4++;
                arrayList11 = arrayList2;
                arrayList9 = arrayList3;
                bundleArr2 = null;
            }
            arrayList = arrayList9;
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            if (builder.f18441m == null) {
                builder.f18441m = new Bundle();
            }
            builder.f18441m.putBundle("android.car.EXTENSIONS", bundle2);
            notificationCompatBuilder = this;
            notificationCompatBuilder.d.putBundle("android.car.EXTENSIONS", bundle3);
        } else {
            arrayList = arrayList9;
        }
        int i6 = Build.VERSION.SDK_INT;
        notificationCompatBuilder.f18451b.setExtras(builder.f18441m);
        Api24Impl.e(notificationCompatBuilder.f18451b, null);
        Api26Impl.b(notificationCompatBuilder.f18451b, 0);
        Api26Impl.e(notificationCompatBuilder.f18451b, null);
        Api26Impl.f(notificationCompatBuilder.f18451b, null);
        Api26Impl.g(notificationCompatBuilder.f18451b, 0L);
        Api26Impl.d(notificationCompatBuilder.f18451b, 0);
        if (!TextUtils.isEmpty(builder.f18442n)) {
            notificationCompatBuilder.f18451b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        if (i6 >= 28) {
            Iterator it7 = arrayList.iterator();
            while (it7.hasNext()) {
                Person person2 = (Person) it7.next();
                Notification.Builder builder3 = notificationCompatBuilder.f18451b;
                person2.getClass();
                Api28Impl.a(builder3, Person.Api28Impl.b(person2));
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.a(notificationCompatBuilder.f18451b, builder.f18443o);
            Api29Impl.b(notificationCompatBuilder.f18451b, null);
        }
    }

    @Override // androidx.core.app.NotificationBuilderWithBuilderAccessor
    public final Notification.Builder a() {
        return this.f18451b;
    }

    public final void b(NotificationCompat.Action action) {
        IconCompat a2 = action.a();
        android.app.RemoteInput[] remoteInputArr = null;
        Notification.Action.Builder a3 = Api23Impl.a(a2 != null ? a2.h() : null, action.f18419i, action.f18420j);
        RemoteInput[] remoteInputArr2 = action.f18415c;
        if (remoteInputArr2 != null) {
            if (remoteInputArr2 != null) {
                remoteInputArr = new android.app.RemoteInput[remoteInputArr2.length];
                for (int i2 = 0; i2 < remoteInputArr2.length; i2++) {
                    remoteInputArr[i2] = RemoteInput.a(remoteInputArr2[i2]);
                }
            }
            for (android.app.RemoteInput remoteInput : remoteInputArr) {
                Api20Impl.c(a3, remoteInput);
            }
        }
        Bundle bundle = action.f18413a;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        boolean z2 = action.d;
        bundle2.putBoolean("android.support.allowGeneratedReplies", z2);
        int i3 = Build.VERSION.SDK_INT;
        Api24Impl.a(a3, z2);
        int i4 = action.f18416f;
        bundle2.putInt("android.support.action.semanticAction", i4);
        if (i3 >= 28) {
            Api28Impl.b(a3, i4);
        }
        if (i3 >= 29) {
            Api29Impl.c(a3, action.f18417g);
        }
        if (i3 >= 31) {
            Api31Impl.a(a3, action.f18421k);
        }
        bundle2.putBoolean("android.support.action.showsUserInterface", action.e);
        Api20Impl.b(a3, bundle2);
        Api20Impl.a(this.f18451b, Api20Impl.d(a3));
    }
}
