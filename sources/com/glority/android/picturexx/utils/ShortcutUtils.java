package com.glority.android.picturexx.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import androidx.core.content.pm.ShortcutInfoCompat;
import androidx.core.content.pm.ShortcutManagerCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.glority.android.core.app.AppContext;
import com.glority.android.picturexx.business.R;
import com.glority.android.picturexx.constants.ShortcutConstants;
import com.glority.utils.stability.LogUtils;
import java.util.Map;
import java.util.function.BiConsumer;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShortcutUtils.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, d2 = {"Lcom/glority/android/picturexx/utils/ShortcutUtils;", "", "<init>", "()V", "setStableShortcuts", "", "activity", "Landroid/content/Context;", "addOneDayTrialShortcut", "businessMod_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class ShortcutUtils {
    public static final int $stable = 0;
    public static final ShortcutUtils INSTANCE = new ShortcutUtils();

    private ShortcutUtils() {
    }

    public final void setStableShortcuts(Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("coinsnap://coinidentifierai.com/shortcut/grade"));
            intent.setPackage(activity.getPackageName());
            ShortcutInfoCompat build = new ShortcutInfoCompat.Builder(activity, "grade").setShortLabel(activity.getString(R.string.collection_grade)).setLongLabel(activity.getString(R.string.collection_grade)).setIcon(IconCompat.createWithResource(activity, R.drawable.icon_shortcut_grade)).setIntent(intent).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("coinsnap://coinidentifierai.com/shortcut/identify"));
            intent2.setPackage(activity.getPackageName());
            ShortcutInfoCompat build2 = new ShortcutInfoCompat.Builder(activity, "identify").setShortLabel(activity.getString(R.string.homepage_identify)).setLongLabel(activity.getString(R.string.homepage_identify)).setIcon(IconCompat.createWithResource(activity, R.drawable.icon_shortcuts_identify)).setIntent(intent2).build();
            Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
            Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse("coinsnap://coinidentifierai.com/shortcut/feedback"));
            intent3.setPackage(activity.getPackageName());
            ShortcutInfoCompat build3 = new ShortcutInfoCompat.Builder(activity, ShortcutConstants.FEEDBACK_SHORTCUT_ID).setShortLabel(activity.getString(R.string.setting_text_feedback)).setLongLabel(activity.getString(R.string.setting_text_feedback)).setIcon(IconCompat.createWithResource(activity, R.drawable.icon_shortcuts_feedback)).setIntent(intent3).build();
            Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
            Intent intent4 = new Intent("android.intent.action.VIEW", Uri.parse("coinsnap://coinidentifierai.com/shortcut/collection"));
            intent4.setPackage(activity.getPackageName());
            ShortcutInfoCompat build4 = new ShortcutInfoCompat.Builder(activity, "collection").setShortLabel(activity.getString(R.string.me_tab_collection)).setLongLabel(activity.getString(R.string.me_tab_collection)).setIcon(IconCompat.createWithResource(activity, R.drawable.icon_shortcuts_collection)).setIntent(intent4).build();
            Intrinsics.checkNotNullExpressionValue(build4, "build(...)");
            ShortcutManagerCompat.pushDynamicShortcut(activity, build);
            ShortcutManagerCompat.pushDynamicShortcut(activity, build2);
            ShortcutManagerCompat.pushDynamicShortcut(activity, build4);
            Boolean.valueOf(ShortcutManagerCompat.pushDynamicShortcut(activity, build3));
        } catch (Exception e) {
            if (AppContext.INSTANCE.isDebugMode()) {
                LogUtils.e(Log.getStackTraceString(e));
            }
        }
    }

    public final void addOneDayTrialShortcut(final Context activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Map mapOf = MapsKt.mapOf(TuplesKt.to(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_ID3, new Pair(Integer.valueOf(R.drawable.icon_135_pro_coin), "Pro coin identify")), TuplesKt.to(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_ID2, new Pair(Integer.valueOf(R.drawable.icon_135_1m_users), "Over 1M users")), TuplesKt.to(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_ID1, new Pair(Integer.valueOf(R.drawable.icon_135_identify_1m), "Identify over 1M")), TuplesKt.to(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_ID, new Pair(Integer.valueOf(R.drawable.icon_135_1d_trial), "Click for 1d trial")));
        final Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("coinsnap://coinidentifierai.com/shortcut/onedayfree"));
        intent.setPackage(activity.getPackageName());
        final Function2<String, Pair<? extends Integer, ? extends String>, Unit> function2 = new Function2<String, Pair<? extends Integer, ? extends String>, Unit>() { // from class: com.glority.android.picturexx.utils.ShortcutUtils$addOneDayTrialShortcut$1
            /* JADX INFO: Access modifiers changed from: package-private */
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(String str, Pair<? extends Integer, ? extends String> pair) {
                invoke2(str, (Pair<Integer, String>) pair);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String t, Pair<Integer, String> u) {
                Intrinsics.checkNotNullParameter(t, "t");
                Intrinsics.checkNotNullParameter(u, "u");
                ShortcutInfoCompat build = new ShortcutInfoCompat.Builder(activity, t).setShortLabel(u.getSecond()).setLongLabel(u.getSecond()).setIcon(IconCompat.createWithResource(activity, u.getFirst().intValue())).setIntent(intent).build();
                Intrinsics.checkNotNullExpressionValue(build, "build(...)");
                ShortcutManagerCompat.pushDynamicShortcut(activity, build);
            }
        };
        mapOf.forEach(new BiConsumer() { // from class: com.glority.android.picturexx.utils.ShortcutUtils$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ShortcutUtils.addOneDayTrialShortcut$lambda$1(Function2.this, obj, obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addOneDayTrialShortcut$lambda$1(Function2 tmp0, Object obj, Object obj2) {
        Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
        tmp0.invoke(obj, obj2);
    }
}
