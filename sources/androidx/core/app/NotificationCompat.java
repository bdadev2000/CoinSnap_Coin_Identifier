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
import com.tools.arruler.photomeasure.camera.ruler.R;
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
    public static C0423y getAction(@NonNull Notification notification, int i9) {
        return getActionCompatFromAction(notification.actions[i9]);
    }

    @NonNull
    @RequiresApi(20)
    public static C0423y getActionCompatFromAction(@NonNull Notification.Action action) {
        q0[] q0VarArr;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        int i11;
        RemoteInput[] g9 = AbstractC0424z.g(action);
        IconCompat iconCompat = null;
        boolean z10 = false;
        if (g9 == null) {
            q0VarArr = null;
        } else {
            q0[] q0VarArr2 = new q0[g9.length];
            for (int i12 = 0; i12 < g9.length; i12++) {
                RemoteInput remoteInput = g9[i12];
                String h6 = AbstractC0424z.h(remoteInput);
                CharSequence f9 = AbstractC0424z.f(remoteInput);
                CharSequence[] b = AbstractC0424z.b(remoteInput);
                boolean a6 = AbstractC0424z.a(remoteInput);
                if (Build.VERSION.SDK_INT >= 29) {
                    i9 = E.c(remoteInput);
                } else {
                    i9 = 0;
                }
                q0VarArr2[i12] = new q0(h6, f9, b, a6, i9, AbstractC0424z.d(remoteInput), null);
            }
            q0VarArr = q0VarArr2;
        }
        int i13 = Build.VERSION.SDK_INT;
        if (!AbstractC0424z.c(action).getBoolean("android.support.allowGeneratedReplies") && !B.a(action)) {
            z8 = false;
        } else {
            z8 = true;
        }
        boolean z11 = AbstractC0424z.c(action).getBoolean("android.support.action.showsUserInterface", true);
        if (i13 >= 28) {
            i10 = D.a(action);
        } else {
            i10 = AbstractC0424z.c(action).getInt("android.support.action.semanticAction", 0);
        }
        int i14 = i10;
        if (i13 >= 29) {
            z9 = E.e(action);
        } else {
            z9 = false;
        }
        if (i13 >= 31) {
            z10 = F.a(action);
        }
        boolean z12 = z10;
        if (A.a(action) == null && (i11 = action.icon) != 0) {
            return new C0423y(i11, action.title, action.actionIntent, AbstractC0424z.c(action), q0VarArr, (q0[]) null, z8, i14, z11, z9, z12);
        }
        if (A.a(action) != null) {
            Icon a9 = A.a(action);
            PorterDuff.Mode mode = IconCompat.f4454k;
            if (M.c.d(a9) != 2 || M.c.b(a9) != 0) {
                iconCompat = M.c.a(a9);
            }
        }
        return new C0423y(iconCompat, action.title, action.actionIntent, AbstractC0424z.c(action), q0VarArr, (q0[]) null, z8, i14, z11, z9, z12);
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
            return E.a(notification);
        }
        return false;
    }

    public static boolean getAutoCancel(@NonNull Notification notification) {
        if ((notification.flags & 16) != 0) {
            return true;
        }
        return false;
    }

    public static int getBadgeIconType(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C.a(notification);
        }
        return 0;
    }

    @Nullable
    public static M getBubbleMetadata(@NonNull Notification notification) {
        Notification.BubbleMetadata b;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 29 || (b = E.b(notification)) == null) {
            return null;
        }
        if (i9 >= 30) {
            return L.a(b);
        }
        if (i9 != 29) {
            return null;
        }
        return K.a(b);
    }

    @Nullable
    public static String getCategory(@NonNull Notification notification) {
        return notification.category;
    }

    @Nullable
    public static String getChannelId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C.b(notification);
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
        return AbstractC0424z.e(notification);
    }

    public static int getGroupAlertBehavior(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C.c(notification);
        }
        return 0;
    }

    public static boolean getHighPriority(@NonNull Notification notification) {
        if ((notification.flags & 128) != 0) {
            return true;
        }
        return false;
    }

    @NonNull
    @RequiresApi(21)
    public static List<C0423y> getInvisibleActions(@NonNull Notification notification) {
        boolean z8;
        Bundle[] bundleArr;
        Bundle[] bundleArr2;
        ArrayList arrayList = new ArrayList();
        Bundle bundle = notification.extras.getBundle("android.car.EXTENSIONS");
        if (bundle == null) {
            return arrayList;
        }
        Bundle bundle2 = bundle.getBundle("invisible_actions");
        if (bundle2 != null) {
            for (int i9 = 0; i9 < bundle2.size(); i9++) {
                Bundle bundle3 = bundle2.getBundle(Integer.toString(i9));
                Bundle bundle4 = bundle3.getBundle("extras");
                if (bundle4 != null) {
                    z8 = bundle4.getBoolean("android.support.allowGeneratedReplies", false);
                } else {
                    z8 = false;
                }
                int i10 = bundle3.getInt(RewardPlus.ICON);
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
                q0[] a6 = AbstractC0408i.a(bundleArr);
                Parcelable[] parcelableArray2 = bundle3.getParcelableArray("dataOnlyRemoteInputs");
                if (!(parcelableArray2 instanceof Bundle[]) && parcelableArray2 != null) {
                    bundleArr2 = (Bundle[]) Arrays.copyOf(parcelableArray2, parcelableArray2.length, Bundle[].class);
                    bundle3.putParcelableArray("dataOnlyRemoteInputs", bundleArr2);
                } else {
                    bundleArr2 = (Bundle[]) parcelableArray2;
                }
                arrayList.add(new C0423y(i10, charSequence, pendingIntent, bundle5, a6, AbstractC0408i.a(bundleArr2), z8, bundle3.getInt("semanticAction"), bundle3.getBoolean("showsUserInterface"), false, false));
            }
        }
        return arrayList;
    }

    public static boolean getLocalOnly(@NonNull Notification notification) {
        if ((notification.flags & FLAG_LOCAL_ONLY) != 0) {
            return true;
        }
        return false;
    }

    @Nullable
    public static I.m getLocusId(@NonNull Notification notification) {
        I.m mVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        LocusId d2 = E.d(notification);
        if (d2 != null) {
            String b = I.l.b(d2);
            if (!TextUtils.isEmpty(b)) {
                mVar = new I.m(b);
            } else {
                throw new IllegalArgumentException("id cannot be empty");
            }
        }
        return mVar;
    }

    @NonNull
    public static Notification[] getNotificationArrayFromBundle(@NonNull Bundle bundle, @NonNull String str) {
        Parcelable[] parcelableArray = bundle.getParcelableArray(str);
        if (!(parcelableArray instanceof Notification[]) && parcelableArray != null) {
            Notification[] notificationArr = new Notification[parcelableArray.length];
            for (int i9 = 0; i9 < parcelableArray.length; i9++) {
                notificationArr[i9] = (Notification) parcelableArray[i9];
            }
            bundle.putParcelableArray(str, notificationArr);
            return notificationArr;
        }
        return (Notification[]) parcelableArray;
    }

    public static boolean getOngoing(@NonNull Notification notification) {
        if ((notification.flags & 2) != 0) {
            return true;
        }
        return false;
    }

    public static boolean getOnlyAlertOnce(@NonNull Notification notification) {
        if ((notification.flags & 8) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [androidx.core.app.m0, java.lang.Object] */
    @NonNull
    public static List<m0> getPeople(@NonNull Notification notification) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 28) {
            ArrayList parcelableArrayList = notification.extras.getParcelableArrayList(EXTRA_PEOPLE_LIST);
            if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    arrayList.add(l0.a(V1.b.d(it.next())));
                }
            }
        } else {
            String[] stringArray = notification.extras.getStringArray(EXTRA_PEOPLE);
            if (stringArray != null && stringArray.length != 0) {
                for (String str : stringArray) {
                    ?? obj = new Object();
                    obj.f4411a = null;
                    obj.b = null;
                    obj.f4412c = str;
                    obj.f4413d = null;
                    obj.f4414e = false;
                    obj.f4415f = false;
                    arrayList.add(obj);
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
            return C.d(notification);
        }
        return null;
    }

    @Nullable
    public static String getShortcutId(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C.e(notification);
        }
        return null;
    }

    public static boolean getShowWhen(@NonNull Notification notification) {
        return notification.extras.getBoolean(EXTRA_SHOW_WHEN);
    }

    @Nullable
    public static String getSortKey(@NonNull Notification notification) {
        return AbstractC0424z.i(notification);
    }

    @Nullable
    public static CharSequence getSubText(@NonNull Notification notification) {
        return notification.extras.getCharSequence(EXTRA_SUB_TEXT);
    }

    public static long getTimeoutAfter(@NonNull Notification notification) {
        if (Build.VERSION.SDK_INT >= 26) {
            return C.f(notification);
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
        if ((notification.flags & 512) != 0) {
            return true;
        }
        return false;
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
