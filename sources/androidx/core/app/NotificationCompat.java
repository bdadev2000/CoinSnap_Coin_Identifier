package androidx.core.app;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.annotation.ColorInt;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import com.cooldev.gba.emulator.gameboy.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class NotificationCompat {

    /* loaded from: classes.dex */
    public static class Action {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f18413a;

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f18414b;

        /* renamed from: c, reason: collision with root package name */
        public final RemoteInput[] f18415c;
        public final boolean d;
        public final boolean e;

        /* renamed from: f, reason: collision with root package name */
        public final int f18416f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f18417g;

        /* renamed from: h, reason: collision with root package name */
        public final int f18418h;

        /* renamed from: i, reason: collision with root package name */
        public final CharSequence f18419i;

        /* renamed from: j, reason: collision with root package name */
        public final PendingIntent f18420j;

        /* renamed from: k, reason: collision with root package name */
        public final boolean f18421k;

        /* loaded from: classes.dex */
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final IconCompat f18422a;

            /* renamed from: b, reason: collision with root package name */
            public final CharSequence f18423b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f18424c;
            public final Bundle d;
            public final int e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f18425f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f18426g;

            /* renamed from: h, reason: collision with root package name */
            public final boolean f18427h;

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api20Impl {
                @DoNotInline
                public static Bundle a(Notification.Action action) {
                    return action.getExtras();
                }

                @DoNotInline
                public static android.app.RemoteInput[] b(Notification.Action action) {
                    return action.getRemoteInputs();
                }
            }

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api23Impl {
                @DoNotInline
                public static Icon a(Notification.Action action) {
                    return action.getIcon();
                }
            }

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api24Impl {
                @DoNotInline
                public static boolean a(Notification.Action action) {
                    return action.getAllowGeneratedReplies();
                }
            }

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api28Impl {
                @DoNotInline
                public static int a(Notification.Action action) {
                    return action.getSemanticAction();
                }
            }

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api29Impl {
                @DoNotInline
                public static boolean a(Notification.Action action) {
                    return action.isContextual();
                }
            }

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api31Impl {
                @DoNotInline
                public static boolean a(Notification.Action action) {
                    return action.isAuthenticationRequired();
                }
            }

            public Builder(IconCompat iconCompat, SpannableStringBuilder spannableStringBuilder) {
                Bundle bundle = new Bundle();
                this.f18424c = true;
                this.f18425f = true;
                this.f18422a = iconCompat;
                this.f18423b = Builder.b(spannableStringBuilder);
                this.d = bundle;
                this.f18424c = true;
                this.e = 0;
                this.f18425f = true;
                this.f18426g = false;
                this.f18427h = false;
            }
        }

        /* loaded from: classes.dex */
        public interface Extender {
        }

        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: classes.dex */
        public @interface SemanticAction {
        }

        /* loaded from: classes.dex */
        public static final class WearableExtender implements Extender {
            public final Object clone() {
                return new Object();
            }
        }

        public Action(int i2, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, boolean z2, int i3, boolean z3, boolean z4, boolean z5) {
            this(i2 != 0 ? IconCompat.c(null, "", i2) : null, charSequence, pendingIntent, bundle, remoteInputArr, null, z2, i3, z3, z4, z5);
        }

        public final IconCompat a() {
            int i2;
            if (this.f18414b == null && (i2 = this.f18418h) != 0) {
                this.f18414b = IconCompat.c(null, "", i2);
            }
            return this.f18414b;
        }

        public Action(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, RemoteInput[] remoteInputArr, RemoteInput[] remoteInputArr2, boolean z2, int i2, boolean z3, boolean z4, boolean z5) {
            this.e = true;
            this.f18414b = iconCompat;
            if (iconCompat != null && iconCompat.f() == 2) {
                this.f18418h = iconCompat.d();
            }
            this.f18419i = Builder.b(charSequence);
            this.f18420j = pendingIntent;
            this.f18413a = bundle == null ? new Bundle() : bundle;
            this.f18415c = remoteInputArr;
            this.d = z2;
            this.f18416f = i2;
            this.e = z3;
            this.f18417g = z4;
            this.f18421k = z5;
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api20Impl {
        @DoNotInline
        public static boolean a(android.app.RemoteInput remoteInput) {
            return remoteInput.getAllowFreeFormInput();
        }

        @DoNotInline
        public static CharSequence[] b(android.app.RemoteInput remoteInput) {
            return remoteInput.getChoices();
        }

        @DoNotInline
        public static Bundle c(Notification.Action action) {
            return action.getExtras();
        }

        @DoNotInline
        public static Bundle d(android.app.RemoteInput remoteInput) {
            return remoteInput.getExtras();
        }

        @DoNotInline
        public static String e(Notification notification) {
            return notification.getGroup();
        }

        @DoNotInline
        public static CharSequence f(android.app.RemoteInput remoteInput) {
            return remoteInput.getLabel();
        }

        @DoNotInline
        public static android.app.RemoteInput[] g(Notification.Action action) {
            return action.getRemoteInputs();
        }

        @DoNotInline
        public static String h(android.app.RemoteInput remoteInput) {
            return remoteInput.getResultKey();
        }

        @DoNotInline
        public static String i(Notification notification) {
            return notification.getSortKey();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api23Impl {
        @DoNotInline
        public static Icon a(Notification.Action action) {
            return action.getIcon();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api24Impl {
        @DoNotInline
        public static boolean a(Notification.Action action) {
            return action.getAllowGeneratedReplies();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api26Impl {
        @DoNotInline
        public static int a(Notification notification) {
            return notification.getBadgeIconType();
        }

        @DoNotInline
        public static String b(Notification notification) {
            return notification.getChannelId();
        }

        @DoNotInline
        public static int c(Notification notification) {
            return notification.getGroupAlertBehavior();
        }

        @DoNotInline
        public static CharSequence d(Notification notification) {
            return notification.getSettingsText();
        }

        @DoNotInline
        public static String e(Notification notification) {
            return notification.getShortcutId();
        }

        @DoNotInline
        public static long f(Notification notification) {
            return notification.getTimeoutAfter();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api28Impl {
        @DoNotInline
        public static int a(Notification.Action action) {
            return action.getSemanticAction();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static boolean a(Notification notification) {
            return notification.getAllowSystemGeneratedContextualActions();
        }

        @DoNotInline
        public static Notification.BubbleMetadata b(Notification notification) {
            return notification.getBubbleMetadata();
        }

        @DoNotInline
        public static int c(android.app.RemoteInput remoteInput) {
            return remoteInput.getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static LocusId d(Notification notification) {
            return notification.getLocusId();
        }

        @DoNotInline
        public static boolean e(Notification.Action action) {
            return action.isContextual();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api31Impl {
        @DoNotInline
        public static boolean a(Notification.Action action) {
            return action.isAuthenticationRequired();
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface BadgeIconType {
    }

    /* loaded from: classes.dex */
    public static class BigPictureStyle extends Style {

        /* renamed from: b, reason: collision with root package name */
        public IconCompat f18428b;

        /* renamed from: c, reason: collision with root package name */
        public IconCompat f18429c;
        public boolean d;

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api23Impl {
            @RequiresApi
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigLargeIcon(icon);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api31Impl {
            @RequiresApi
            public static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            @RequiresApi
            public static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            @RequiresApi
            public static void c(Notification.BigPictureStyle bigPictureStyle, boolean z2) {
                bigPictureStyle.showBigPictureWhenCollapsed(z2);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Bitmap bitmap;
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18451b).setBigContentTitle(null);
            IconCompat iconCompat = this.f18428b;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    Api31Impl.a(bigContentTitle, iconCompat.i(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18450a));
                } else if (iconCompat.f() == 1) {
                    IconCompat iconCompat2 = this.f18428b;
                    int i2 = iconCompat2.f18556a;
                    if (i2 == -1) {
                        Object obj = iconCompat2.f18557b;
                        bitmap = obj instanceof Bitmap ? (Bitmap) obj : null;
                    } else if (i2 == 1) {
                        bitmap = (Bitmap) iconCompat2.f18557b;
                    } else {
                        if (i2 != 5) {
                            throw new IllegalStateException("called getBitmap() on " + iconCompat2);
                        }
                        Bitmap bitmap2 = (Bitmap) iconCompat2.f18557b;
                        int min = (int) (Math.min(bitmap2.getWidth(), bitmap2.getHeight()) * 0.6666667f);
                        Bitmap createBitmap = Bitmap.createBitmap(min, min, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(createBitmap);
                        Paint paint = new Paint(3);
                        float f2 = min;
                        float f3 = 0.5f * f2;
                        float f4 = 0.9166667f * f3;
                        float f5 = 0.010416667f * f2;
                        paint.setColor(0);
                        paint.setShadowLayer(f5, 0.0f, f2 * 0.020833334f, 1023410176);
                        canvas.drawCircle(f3, f3, f4, paint);
                        paint.setShadowLayer(f5, 0.0f, 0.0f, 503316480);
                        canvas.drawCircle(f3, f3, f4, paint);
                        paint.clearShadowLayer();
                        paint.setColor(-16777216);
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        matrix.setTranslate((-(bitmap2.getWidth() - min)) / 2.0f, (-(bitmap2.getHeight() - min)) / 2.0f);
                        bitmapShader.setLocalMatrix(matrix);
                        paint.setShader(bitmapShader);
                        canvas.drawCircle(f3, f3, f4, paint);
                        canvas.setBitmap(null);
                        bitmap = createBitmap;
                    }
                    bigContentTitle = bigContentTitle.bigPicture(bitmap);
                }
            }
            if (this.d) {
                IconCompat iconCompat3 = this.f18429c;
                if (iconCompat3 == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    Api23Impl.a(bigContentTitle, iconCompat3.i(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18450a));
                }
            }
            if (Build.VERSION.SDK_INT >= 31) {
                Api31Impl.c(bigContentTitle, false);
                Api31Impl.b(bigContentTitle, null);
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }
    }

    /* loaded from: classes.dex */
    public static class BigTextStyle extends Style {

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f18430b;

        @Override // androidx.core.app.NotificationCompat.Style
        public final void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            new Notification.BigTextStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18451b).setBigContentTitle(null).bigText(this.f18430b);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }
    }

    /* loaded from: classes.dex */
    public static final class BubbleMetadata {

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api29Impl {
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api30Impl {
        }

        /* loaded from: classes.dex */
        public static final class Builder {
        }
    }

    /* loaded from: classes.dex */
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f18431a;
        public CharSequence e;

        /* renamed from: f, reason: collision with root package name */
        public CharSequence f18434f;

        /* renamed from: g, reason: collision with root package name */
        public PendingIntent f18435g;

        /* renamed from: h, reason: collision with root package name */
        public IconCompat f18436h;

        /* renamed from: i, reason: collision with root package name */
        public int f18437i;

        /* renamed from: k, reason: collision with root package name */
        public Style f18439k;

        /* renamed from: m, reason: collision with root package name */
        public Bundle f18441m;

        /* renamed from: n, reason: collision with root package name */
        public String f18442n;

        /* renamed from: o, reason: collision with root package name */
        public final boolean f18443o;

        /* renamed from: p, reason: collision with root package name */
        public final Notification f18444p;

        /* renamed from: q, reason: collision with root package name */
        public final ArrayList f18445q;

        /* renamed from: b, reason: collision with root package name */
        public final ArrayList f18432b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f18433c = new ArrayList();
        public final ArrayList d = new ArrayList();

        /* renamed from: j, reason: collision with root package name */
        public final boolean f18438j = true;

        /* renamed from: l, reason: collision with root package name */
        public boolean f18440l = false;

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api21Impl {
            @DoNotInline
            public static AudioAttributes a(AudioAttributes.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static AudioAttributes.Builder b() {
                return new AudioAttributes.Builder();
            }

            @DoNotInline
            public static AudioAttributes.Builder c(AudioAttributes.Builder builder, int i2) {
                return builder.setContentType(i2);
            }

            @DoNotInline
            public static AudioAttributes.Builder d(AudioAttributes.Builder builder, int i2) {
                return builder.setLegacyStreamType(i2);
            }

            @DoNotInline
            public static AudioAttributes.Builder e(AudioAttributes.Builder builder, int i2) {
                return builder.setUsage(i2);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api23Impl {
            @DoNotInline
            public static Icon a(Notification notification) {
                return notification.getLargeIcon();
            }

            @DoNotInline
            public static Icon b(Notification notification) {
                return notification.getSmallIcon();
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api24Impl {
            @DoNotInline
            public static RemoteViews a(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            public static RemoteViews b(Notification.Builder builder) {
                return builder.createContentView();
            }

            @DoNotInline
            public static RemoteViews c(Notification.Builder builder) {
                return builder.createHeadsUpContentView();
            }

            @DoNotInline
            public static Notification.Builder d(Context context, Notification notification) {
                return Notification.Builder.recoverBuilder(context, notification);
            }
        }

        public Builder(Context context, String str) {
            Notification notification = new Notification();
            this.f18444p = notification;
            this.f18431a = context;
            this.f18442n = str;
            notification.when = System.currentTimeMillis();
            notification.audioStreamType = -1;
            this.f18437i = 0;
            this.f18445q = new ArrayList();
            this.f18443o = true;
        }

        public static CharSequence b(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        public final Notification a() {
            Bundle bundle;
            NotificationCompatBuilder notificationCompatBuilder = new NotificationCompatBuilder(this);
            Builder builder = notificationCompatBuilder.f18452c;
            Style style = builder.f18439k;
            if (style != null) {
                style.b(notificationCompatBuilder);
            }
            if (style != null) {
                style.e();
            }
            Notification build = notificationCompatBuilder.f18451b.build();
            if (style != null) {
                style.d();
            }
            if (style != null) {
                builder.f18439k.f();
            }
            if (style != null && (bundle = build.extras) != null) {
                style.a(bundle);
            }
            return build;
        }

        public final void c(Bitmap bitmap) {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f18431a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.f18555k;
            bitmap.getClass();
            IconCompat iconCompat = new IconCompat(1);
            iconCompat.f18557b = bitmap;
            this.f18436h = iconCompat;
        }

        public final void d(Style style) {
            if (this.f18439k != style) {
                this.f18439k = style;
                if (style != null) {
                    style.g(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static class CallStyle extends Style {

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api20Impl {
            @DoNotInline
            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static Notification.Action.Builder b(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Notification.Action.Builder d(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i2, charSequence, pendingIntent);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api21Impl {
            @DoNotInline
            public static Notification.Builder a(Notification.Builder builder, String str) {
                return builder.addPerson(str);
            }

            @DoNotInline
            public static Notification.Builder b(Notification.Builder builder, String str) {
                return builder.setCategory(str);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api23Impl {
            @DoNotInline
            public static Parcelable a(Icon icon) {
                return icon;
            }

            @DoNotInline
            public static Notification.Action.Builder b(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }

            @DoNotInline
            public static void c(Notification.Builder builder, Icon icon) {
                builder.setLargeIcon(icon);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api24Impl {
            @DoNotInline
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
                return builder.setAllowGeneratedReplies(z2);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api28Impl {
            @DoNotInline
            public static Notification.Builder a(Notification.Builder builder, android.app.Person person) {
                return builder.addPerson(person);
            }

            @DoNotInline
            public static Parcelable b(android.app.Person person) {
                return person;
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api31Impl {
            @DoNotInline
            public static Notification.CallStyle a(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            public static Notification.CallStyle b(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            @DoNotInline
            public static Notification.CallStyle c(@NonNull android.app.Person person, @NonNull PendingIntent pendingIntent, @NonNull PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            @DoNotInline
            public static Notification.CallStyle d(Notification.CallStyle callStyle, @ColorInt int i2) {
                return callStyle.setAnswerButtonColorHint(i2);
            }

            @DoNotInline
            public static Notification.Action.Builder e(Notification.Action.Builder builder, boolean z2) {
                return builder.setAuthenticationRequired(z2);
            }

            @DoNotInline
            public static Notification.CallStyle f(Notification.CallStyle callStyle, @ColorInt int i2) {
                return callStyle.setDeclineButtonColorHint(i2);
            }

            @DoNotInline
            public static Notification.CallStyle g(Notification.CallStyle callStyle, boolean z2) {
                return callStyle.setIsVideo(z2);
            }

            @DoNotInline
            public static Notification.CallStyle h(Notification.CallStyle callStyle, @Nullable Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            @DoNotInline
            public static Notification.CallStyle i(Notification.CallStyle callStyle, @Nullable CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        /* loaded from: classes.dex */
        public @interface CallType {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", 0);
            bundle.putBoolean("android.callIsVideo", false);
            bundle.putCharSequence("android.verificationText", null);
            bundle.putParcelable("android.answerIntent", null);
            bundle.putParcelable("android.declineIntent", null);
            bundle.putParcelable("android.hangUpIntent", null);
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            if (Build.VERSION.SDK_INT >= 31) {
                if (Log.isLoggable("NotifCompat", 3)) {
                    Log.d("NotifCompat", "Unrecognized call type in CallStyle: " + String.valueOf(0));
                    return;
                }
                return;
            }
            Notification.Builder builder = ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18451b;
            builder.setContentTitle(null);
            Bundle bundle = this.f18447a.f18441m;
            CharSequence charSequence = (bundle == null || !bundle.containsKey("android.text")) ? null : this.f18447a.f18441m.getCharSequence("android.text");
            builder.setContentText(charSequence != null ? charSequence : null);
            Api21Impl.b(builder, "call");
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }
    }

    /* loaded from: classes.dex */
    public static final class CarExtender implements Extender {

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api20Impl {
            @DoNotInline
            public static RemoteInput.Builder a(RemoteInput.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static android.app.RemoteInput b(RemoteInput.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Parcelable c(android.app.RemoteInput remoteInput) {
                return remoteInput;
            }

            @DoNotInline
            public static RemoteInput.Builder d(String str) {
                return new RemoteInput.Builder(str);
            }

            @DoNotInline
            public static boolean e(android.app.RemoteInput remoteInput) {
                return remoteInput.getAllowFreeFormInput();
            }

            @DoNotInline
            public static CharSequence[] f(android.app.RemoteInput remoteInput) {
                return remoteInput.getChoices();
            }

            @DoNotInline
            public static Bundle g(android.app.RemoteInput remoteInput) {
                return remoteInput.getExtras();
            }

            @DoNotInline
            public static CharSequence h(android.app.RemoteInput remoteInput) {
                return remoteInput.getLabel();
            }

            @DoNotInline
            public static String i(android.app.RemoteInput remoteInput) {
                return remoteInput.getResultKey();
            }

            @DoNotInline
            public static RemoteInput.Builder j(RemoteInput.Builder builder, boolean z2) {
                return builder.setAllowFreeFormInput(z2);
            }

            @DoNotInline
            public static RemoteInput.Builder k(RemoteInput.Builder builder, CharSequence[] charSequenceArr) {
                return builder.setChoices(charSequenceArr);
            }

            @DoNotInline
            public static RemoteInput.Builder l(RemoteInput.Builder builder, CharSequence charSequence) {
                return builder.setLabel(charSequence);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api29Impl {
            @DoNotInline
            public static int a(android.app.RemoteInput remoteInput) {
                return remoteInput.getEditChoicesBeforeSending();
            }
        }

        @Deprecated
        /* loaded from: classes.dex */
        public static class UnreadConversation {

            /* loaded from: classes.dex */
            public static class Builder {
            }
        }
    }

    /* loaded from: classes.dex */
    public static class DecoratedCustomViewStyle extends Style {

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api24Impl {
            @DoNotInline
            public static Notification.Style a() {
                return new Notification.DecoratedCustomViewStyle();
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            ((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18451b.setStyle(Api24Impl.a());
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$DecoratedCustomViewStyle";
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void d() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void e() {
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void f() {
        }
    }

    /* loaded from: classes.dex */
    public interface Extender {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface GroupAlertBehavior {
    }

    /* loaded from: classes.dex */
    public static class InboxStyle extends Style {
        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            new Notification.InboxStyle(((NotificationCompatBuilder) notificationBuilderWithBuilderAccessor).f18451b).setBigContentTitle(null);
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }
    }

    /* loaded from: classes.dex */
    public static class MessagingStyle extends Style {

        /* renamed from: b, reason: collision with root package name */
        public Boolean f18446b;

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api24Impl {
            @DoNotInline
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            @DoNotInline
            public static Notification.MessagingStyle b(CharSequence charSequence) {
                return new Notification.MessagingStyle(charSequence);
            }

            @DoNotInline
            public static Notification.MessagingStyle c(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api26Impl {
            @DoNotInline
            public static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api28Impl {
            @DoNotInline
            public static Notification.MessagingStyle a(android.app.Person person) {
                return new Notification.MessagingStyle(person);
            }

            @DoNotInline
            public static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z2) {
                return messagingStyle.setGroupConversation(z2);
            }
        }

        /* loaded from: classes.dex */
        public static final class Message {

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api24Impl {
                @DoNotInline
                public static Notification.MessagingStyle.Message a(CharSequence charSequence, long j2, CharSequence charSequence2) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, charSequence2);
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message b(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            @RequiresApi
            /* loaded from: classes.dex */
            public static class Api28Impl {
                @DoNotInline
                public static Parcelable a(android.app.Person person) {
                    return person;
                }

                @DoNotInline
                public static Notification.MessagingStyle.Message b(CharSequence charSequence, long j2, android.app.Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j2, person);
                }
            }
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void a(Bundle bundle) {
            super.a(bundle);
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
            Boolean bool;
            Builder builder = this.f18447a;
            boolean z2 = false;
            if ((builder == null || builder.f18431a.getApplicationInfo().targetSdkVersion >= 28 || this.f18446b != null) && (bool = this.f18446b) != null) {
                z2 = bool.booleanValue();
            }
            this.f18446b = Boolean.valueOf(z2);
            if (Build.VERSION.SDK_INT < 28) {
                throw null;
            }
            throw null;
        }

        @Override // androidx.core.app.NotificationCompat.Style
        public final String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface NotificationVisibility {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ServiceNotificationBehavior {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface StreamType {
    }

    /* loaded from: classes.dex */
    public static abstract class Style {

        /* renamed from: a, reason: collision with root package name */
        public Builder f18447a;

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api24Impl {
            @DoNotInline
            public static void a(RemoteViews remoteViews, int i2, boolean z2) {
                remoteViews.setChronometerCountDown(i2, z2);
            }
        }

        public void a(Bundle bundle) {
            String c2 = c();
            if (c2 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c2);
            }
        }

        public void b(NotificationBuilderWithBuilderAccessor notificationBuilderWithBuilderAccessor) {
        }

        public String c() {
            return null;
        }

        public void d() {
        }

        public void e() {
        }

        public void f() {
        }

        public final void g(Builder builder) {
            if (this.f18447a != builder) {
                this.f18447a = builder;
                if (builder != null) {
                    builder.d(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class TvExtender implements Extender {
    }

    /* loaded from: classes.dex */
    public static final class WearableExtender implements Extender {

        /* renamed from: a, reason: collision with root package name */
        public ArrayList f18448a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList f18449b;

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api20Impl {
            @DoNotInline
            public static Notification.Action.Builder a(Notification.Action.Builder builder, Bundle bundle) {
                return builder.addExtras(bundle);
            }

            @DoNotInline
            public static Notification.Action.Builder b(Notification.Action.Builder builder, android.app.RemoteInput remoteInput) {
                return builder.addRemoteInput(remoteInput);
            }

            @DoNotInline
            public static Notification.Action c(Notification.Action.Builder builder) {
                return builder.build();
            }

            @DoNotInline
            public static Notification.Action.Builder d(int i2, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(i2, charSequence, pendingIntent);
            }

            @DoNotInline
            public static Action e(ArrayList<Parcelable> arrayList, int i2) {
                RemoteInput[] remoteInputArr;
                int i3;
                Notification.Action action = (Notification.Action) arrayList.get(i2);
                android.app.RemoteInput[] g2 = Api20Impl.g(action);
                if (g2 == null) {
                    remoteInputArr = null;
                } else {
                    RemoteInput[] remoteInputArr2 = new RemoteInput[g2.length];
                    for (int i4 = 0; i4 < g2.length; i4++) {
                        android.app.RemoteInput remoteInput = g2[i4];
                        remoteInputArr2[i4] = new RemoteInput(Api20Impl.h(remoteInput), Api20Impl.f(remoteInput), Api20Impl.b(remoteInput), Api20Impl.a(remoteInput), Build.VERSION.SDK_INT >= 29 ? Api29Impl.c(remoteInput) : 0, Api20Impl.d(remoteInput));
                    }
                    remoteInputArr = remoteInputArr2;
                }
                int i5 = Build.VERSION.SDK_INT;
                boolean z2 = Api20Impl.c(action).getBoolean("android.support.allowGeneratedReplies") || Api24Impl.a(action);
                boolean z3 = Api20Impl.c(action).getBoolean("android.support.action.showsUserInterface", true);
                int a2 = i5 >= 28 ? Api28Impl.a(action) : Api20Impl.c(action).getInt("android.support.action.semanticAction", 0);
                boolean e = i5 >= 29 ? Api29Impl.e(action) : false;
                boolean a3 = i5 >= 31 ? Api31Impl.a(action) : false;
                if (Api23Impl.a(action) != null || (i3 = action.icon) == 0) {
                    return new Action(Api23Impl.a(action) != null ? IconCompat.b(Api23Impl.a(action)) : null, action.title, action.actionIntent, Api20Impl.c(action), remoteInputArr, null, z2, a2, z3, e, a3);
                }
                return new Action(i3, action.title, action.actionIntent, Api20Impl.c(action), remoteInputArr, z2, a2, z3, e, a3);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api23Impl {
            @DoNotInline
            public static Notification.Action.Builder a(Icon icon, CharSequence charSequence, PendingIntent pendingIntent) {
                return new Notification.Action.Builder(icon, charSequence, pendingIntent);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api24Impl {
            @DoNotInline
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
                return builder.setAllowGeneratedReplies(z2);
            }
        }

        @RequiresApi
        /* loaded from: classes.dex */
        public static class Api31Impl {
            @DoNotInline
            public static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z2) {
                return builder.setAuthenticationRequired(z2);
            }
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.core.app.NotificationCompat$WearableExtender] */
        public final Object clone() {
            ?? obj = new Object();
            obj.f18448a = new ArrayList();
            obj.f18449b = new ArrayList();
            obj.f18448a = new ArrayList(this.f18448a);
            obj.f18449b = new ArrayList(this.f18449b);
            return obj;
        }
    }
}
