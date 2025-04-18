package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.drawable.IconCompat;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.plantcare.ai.identifier.plantid.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class NotificationCompat {
    public static final int BADGE_ICON_LARGE = 2;
    public static final int BADGE_ICON_NONE = 0;
    public static final int BADGE_ICON_SMALL = 1;
    public static final String CATEGORY_ALARM = "alarm";
    public static final String CATEGORY_CALL = "call";
    public static final String CATEGORY_EMAIL = "email";
    public static final String CATEGORY_ERROR = "err";
    public static final String CATEGORY_EVENT = "event";
    public static final String CATEGORY_LOCATION_SHARING = "location_sharing";
    public static final String CATEGORY_MESSAGE = "msg";
    public static final String CATEGORY_MISSED_CALL = "missed_call";
    public static final String CATEGORY_NAVIGATION = "navigation";
    public static final String CATEGORY_PROGRESS = "progress";
    public static final String CATEGORY_PROMO = "promo";
    public static final String CATEGORY_RECOMMENDATION = "recommendation";
    public static final String CATEGORY_REMINDER = "reminder";
    public static final String CATEGORY_SERVICE = "service";
    public static final String CATEGORY_SOCIAL = "social";
    public static final String CATEGORY_STATUS = "status";
    public static final String CATEGORY_STOPWATCH = "stopwatch";
    public static final String CATEGORY_SYSTEM = "sys";
    public static final String CATEGORY_TRANSPORT = "transport";
    public static final String CATEGORY_WORKOUT = "workout";
    public static final int COLOR_DEFAULT = 0;
    public static final int DEFAULT_ALL = -1;
    public static final int DEFAULT_LIGHTS = 4;
    public static final int DEFAULT_SOUND = 1;
    public static final int DEFAULT_VIBRATE = 2;

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_COLOR = "android.answerColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_ANSWER_INTENT = "android.answerIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_AUDIO_CONTENTS_URI = "android.audioContents";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BACKGROUND_IMAGE_URI = "android.backgroundImageUri";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_BIG_TEXT = "android.bigText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_IS_VIDEO = "android.callIsVideo";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON = "android.callPerson";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_PERSON_COMPAT = "android.callPersonCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CALL_TYPE = "android.callType";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_GROUP_ID = "android.intent.extra.CHANNEL_GROUP_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHANNEL_ID = "android.intent.extra.CHANNEL_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CHRONOMETER_COUNT_DOWN = "android.chronometerCountDown";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COLORIZED = "android.colorized";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_COMPACT_ACTIONS = "android.compactActions";
    public static final String EXTRA_COMPAT_TEMPLATE = "androidx.core.app.extra.COMPAT_TEMPLATE";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_CONVERSATION_TITLE = "android.conversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_COLOR = "android.declineColor";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_DECLINE_INTENT = "android.declineIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HANG_UP_INTENT = "android.hangUpIntent";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HIDDEN_CONVERSATION_TITLE = "android.hiddenConversationTitle";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_HISTORIC_MESSAGES = "android.messages.historic";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_INFO_TEXT = "android.infoText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_IS_GROUP_CONVERSATION = "android.isGroupConversation";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON = "android.largeIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_LARGE_ICON_BIG = "android.largeIcon.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MEDIA_SESSION = "android.mediaSession";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGES = "android.messages";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_MESSAGING_STYLE_USER = "android.messagingStyleUser";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_ID = "android.intent.extra.NOTIFICATION_ID";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_NOTIFICATION_TAG = "android.intent.extra.NOTIFICATION_TAG";

    @SuppressLint({"ActionValue"})
    @Deprecated
    public static final String EXTRA_PEOPLE = "android.people";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PEOPLE_LIST = "android.people.list";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE = "android.picture";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_CONTENT_DESCRIPTION = "android.pictureContentDescription";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PICTURE_ICON = "android.pictureIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS = "android.progress";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_INDETERMINATE = "android.progressIndeterminate";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_PROGRESS_MAX = "android.progressMax";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_REMOTE_INPUT_HISTORY = "android.remoteInputHistory";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SELF_DISPLAY_NAME = "android.selfDisplayName";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_BIG_PICTURE_WHEN_COLLAPSED = "android.showBigPictureWhenCollapsed";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_CHRONOMETER = "android.showChronometer";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SHOW_WHEN = "android.showWhen";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SMALL_ICON = "android.icon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUB_TEXT = "android.subText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_SUMMARY_TEXT = "android.summaryText";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEMPLATE = "android.template";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT = "android.text";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TEXT_LINES = "android.textLines";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE = "android.title";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_TITLE_BIG = "android.title.big";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON = "android.verificationIcon";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_ICON_COMPAT = "android.verificationIconCompat";

    @SuppressLint({"ActionValue"})
    public static final String EXTRA_VERIFICATION_TEXT = "android.verificationText";
    public static final int FLAG_AUTO_CANCEL = 16;
    public static final int FLAG_BUBBLE = 4096;
    public static final int FLAG_FOREGROUND_SERVICE = 64;
    public static final int FLAG_GROUP_SUMMARY = 512;

    @Deprecated
    public static final int FLAG_HIGH_PRIORITY = 128;
    public static final int FLAG_INSISTENT = 4;
    public static final int FLAG_LOCAL_ONLY = 256;
    public static final int FLAG_NO_CLEAR = 32;
    public static final int FLAG_ONGOING_EVENT = 2;
    public static final int FLAG_ONLY_ALERT_ONCE = 8;
    public static final int FLAG_SHOW_LIGHTS = 1;
    public static final int FOREGROUND_SERVICE_DEFAULT = 0;
    public static final int FOREGROUND_SERVICE_DEFERRED = 2;
    public static final int FOREGROUND_SERVICE_IMMEDIATE = 1;
    public static final int GROUP_ALERT_ALL = 0;
    public static final int GROUP_ALERT_CHILDREN = 2;
    public static final int GROUP_ALERT_SUMMARY = 1;
    public static final String GROUP_KEY_SILENT = "silent";

    @SuppressLint({"ActionValue"})
    public static final String INTENT_CATEGORY_NOTIFICATION_PREFERENCES = "android.intent.category.NOTIFICATION_PREFERENCES";
    public static final int MAX_ACTION_BUTTONS = 3;
    public static final int PRIORITY_DEFAULT = 0;
    public static final int PRIORITY_HIGH = 1;
    public static final int PRIORITY_LOW = -1;
    public static final int PRIORITY_MAX = 2;
    public static final int PRIORITY_MIN = -2;
    public static final int STREAM_DEFAULT = -1;
    private static final String TAG = "NotifCompat";
    public static final int VISIBILITY_PRIVATE = 0;
    public static final int VISIBILITY_PUBLIC = 1;
    public static final int VISIBILITY_SECRET = -1;

    @Deprecated
    public NotificationCompat() {
    }

    @Nullable
    public static b0 getAction(@NonNull Notification notification, int i10) {
        return getActionCompatFromAction(notification.actions[i10]);
    }

    @NonNull
    @RequiresApi(20)
    public static b0 getActionCompatFromAction(@NonNull Notification.Action action) {
        x1[] x1VarArr;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        RemoteInput[] g10 = c0.g(action);
        IconCompat iconCompat = null;
        boolean z12 = false;
        if (g10 == null) {
            x1VarArr = null;
        } else {
            x1[] x1VarArr2 = new x1[g10.length];
            for (int i13 = 0; i13 < g10.length; i13++) {
                RemoteInput remoteInput = g10[i13];
                String h10 = c0.h(remoteInput);
                CharSequence f10 = c0.f(remoteInput);
                CharSequence[] b3 = c0.b(remoteInput);
                boolean a = c0.a(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i10 = h0.c(remoteInput);
                } else {
                    i10 = 0;
                }
                x1VarArr2[i13] = new x1(h10, f10, b3, a, i10, c0.d(remoteInput), null);
            }
            x1VarArr = x1VarArr2;
        }
        int i14 = Build.VERSION.SDK_INT;
        if (!c0.c(action).getBoolean("android.support.allowGeneratedReplies") && !e0.a(action)) {
            z10 = false;
        } else {
            z10 = true;
        }
        boolean z13 = c0.c(action).getBoolean("android.support.action.showsUserInterface", true);
        if (i14 >= 28) {
            i11 = g0.a(action);
        } else {
            i11 = c0.c(action).getInt("android.support.action.semanticAction", 0);
        }
        int i15 = i11;
        if (i14 >= 29) {
            z11 = h0.e(action);
        } else {
            z11 = false;
        }
        if (i14 >= 31) {
            z12 = i0.a(action);
        }
        boolean z14 = z12;
        if (d0.a(action) == null && (i12 = action.icon) != 0) {
            return new b0(i12, action.title, action.actionIntent, c0.c(action), x1VarArr, (x1[]) null, z10, i15, z13, z11, z14);
        }
        if (d0.a(action) != null) {
            Icon a10 = d0.a(action);
            PorterDuff.Mode mode = IconCompat.f1278k;
            if (h0.c.d(a10) != 2 || h0.c.b(a10) != 0) {
                iconCompat = h0.c.a(a10);
            }
        }
        return new b0(iconCompat, action.title, action.actionIntent, c0.c(action), x1VarArr, (x1[]) null, z10, i15, z13, z11, z14);
    }

    public static int getActionCount(@NonNull Notification notification) {
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr.length;
        }
        return 0;
    }

    public static boolean getAllowSystemGeneratedContextualActions(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 29) {
            return h0.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        return (notification.flags & 16) != 0;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f0.a(notification);
        }
        return 0;
    }

    @Nullable
    public static q0 getBubbleMetadata(@NonNull Notification notification) {
        Notification.BubbleMetadata b3;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || (b3 = h0.b(notification)) == null) {
            return null;
        }
        if (i10 >= 30) {
            return o0.a(b3);
        }
        if (i10 != 29) {
            return null;
        }
        return n0.a(b3);
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f0.b(notification);
        }
        return null;
    }

    public static int getColor(@NonNull Notification notification) {
        return notification.color;
    }

    @Nullable
    public static CharSequence getContentInfo(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_INFO_TEXT);
    }

    @Nullable
    public static CharSequence getContentText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TEXT);
    }

    @Nullable
    public static CharSequence getContentTitle(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_TITLE);
    }

    @Nullable
    public static Bundle getExtras(@NonNull Notification notification) {
        return notification.extras;
    }

    @Nullable
    public static String getGroup(@NonNull Notification notification) {
        return c0.e(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f0.c(notification);
        }
        return 0;
    }

    public static boolean getHighPriority(@NonNull Notification notification) {
        return (notification.flags & 128) != 0;
    }

    @NonNull
    @RequiresApi(21)
    public static List<b0> getInvisibleActions(@NonNull Notification notification) {
        boolean z10;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i10 = 0; i10 < bundle2.size(); i10++) {
                Bundle bundle3 = bundle2.getBundle(Integer.toString(i10));
                Bundle bundle4 = bundle3.getBundle("extras");
                if (bundle4 != null) {
                    z10 = bundle4.getBoolean("android.support.allowGeneratedReplies", false);
                } else {
                    z10 = false;
                }
                int i11 = bundle3.getInt(RewardPlus.ICON);
                CharSequence charSequence = bundle3.getCharSequence(CampaignEx.JSON_KEY_TITLE);
                PendingIntent pendingIntent = (PendingIntent) bundle3.getParcelable("actionIntent");
                Bundle bundle5 = bundle3.getBundle("extras");
                Parcelable[] parcelableArray = bundle3.getParcelableArray("remoteInputs");
                if (!(parcelableArray instanceof Bundle[]) && parcelableArray != null) {
                    bundleArr = (Bundle[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Bundle[].class);
                    bundle3.putParcelableArray("remoteInputs", bundleArr);
                } else {
                    bundleArr = (Bundle[]) parcelableArray;
                }
                x1[] s5 = com.bumptech.glide.c.s(bundleArr);
                Parcelable[] parcelableArray2 = bundle3.getParcelableArray("dataOnlyRemoteInputs");
                if (!(parcelableArray2 instanceof Bundle[]) && parcelableArray2 != null) {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle3.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                } else {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                }
                arrayList.add(new b0(i11, charSequence, pendingIntent, bundle5, s5, com.bumptech.glide.c.s(bundleArr2), z10, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        return (notification.flags & FLAG_LOCAL_ONLY) != 0;
    }

    @Nullable
    public static d0.l getLocusId(@NonNull Notification notification) {
        LocusId d10;
        if (Build.VERSION.SDK_INT >= 29 && (d10 = h0.d(notification)) != null) {
            String g10 = ba.a.g(d10);
            if (!TextUtils.isEmpty(g10)) {
                return new d0.l(g10);
            }
            throw new IllegalArgumentException("id cannot be empty");
        }
        return null;
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i10 = 0; i10 < parcelableArray.length; i10++) {
                notificationArr[i10] = (Notification) parcelableArray[i10];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        return (notification.flags & 2) != 0;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        return (notification.flags & 8) != 0;
    }

    @NonNull
    public static List<t1> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(r1.a(androidx.appcompat.widget.b1.l(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    s1 s1Var = new s1();
                    s1Var.f1245c = str;
                    arrayList.add(new t1(s1Var));
                }
            }
        }
        return arrayList;
    }

    @Nullable
    public static Notification getPublicVersion(@NonNull Notification notification) {
        return notification.publicVersion;
    }

    @Nullable
    public static CharSequence getSettingsText(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f0.d(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f0.e(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return c0.i(notification);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return f0.f(notification);
        }
        return 0L;
    }

    public static boolean getUsesChronometer(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_CHRONOMETER);
    }

    public static int getVisibility(@NonNull Notification notification) {
        return notification.visibility;
    }

    public static boolean isGroupSummary(@NonNull Notification notification) {
        return (notification.flags & 512) != 0;
    }

    @Nullable
    public static Bitmap reduceLargeIconSize(@NonNull Context context, @Nullable Bitmap bitmap) {
        if (bitmap != null && Build.VERSION.SDK_INT < 27) {
            Resources resources = context.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
        }
        return bitmap;
    }
}
