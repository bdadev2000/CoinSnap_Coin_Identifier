package com.glority.android.netpromoterscore;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.work.WorkRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableDataRequest;
import com.glority.android.core.route.abtest.AbtestGetVariableRequest;
import com.glority.android.core.utils.data.PersistData;
import com.glority.utils.stability.LogUtils;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.random.Random;
import kotlin.random.RandomKt;
import kotlin.ranges.LongRange;
import kotlin.text.StringsKt;

/* compiled from: NpsPopupController.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J/\u0010\u0012\u001a\u00020\u00132\"\u0010\u0014\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\u0015\"\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00132\u0012\u0010\u0018\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0015\"\u00020\u0006¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\nH\u0002J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u00020\u001cH\u0002J\u0010\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001cH\u0002J\b\u0010\"\u001a\u00020\u001cH\u0002J\u0010\u0010#\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0002J\u0006\u0010$\u001a\u00020\u0013J\b\u0010%\u001a\u00020\u0013H\u0002J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0006H\u0002J\u000e\u0010)\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001eJ/\u0010*\u001a\u00020\u00132\"\u0010\u0014\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\u0015\"\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r¢\u0006\u0002\u0010\u0016J\u000e\u0010+\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r0\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/glority/android/netpromoterscore/NpsPopupController;", "", "()V", "DEFAULT_TIME_GAP_DAYS", "", "KEY_NPS_ABTEST", "", "MAX_MINUTE_LIMIT", "MIN_MINUTE_LIMIT", "appLaunchTimeStamp", "", "excludeActivity", "", "Ljava/lang/Class;", "Landroid/app/Activity;", "excludeActivityKeyword", "excludeActivityName", "timeGap", "addExcludeActivity", "", "clazz", "", "([Ljava/lang/Class;)V", "addExcludeActivityName", "name", "([Ljava/lang/String;)V", "calculateTimeShift", "check", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "checkIfHitAbtestCondition", "checkIfHitExcludeActivity", "checkIfHitTimeGapCondition", "checkIfHitTimeShift", "hasPoppedOther", "init", "initImpl", "match", "pattern", "value", "openNpsDialog", "removeExcludeActivity", "removeExcludeActivityName", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes2.dex */
public final class NpsPopupController {
    private static final int DEFAULT_TIME_GAP_DAYS = 60;
    private static final String KEY_NPS_ABTEST = "nps_global";
    private static final int MAX_MINUTE_LIMIT = 8;
    private static final int MIN_MINUTE_LIMIT = 3;
    private static long appLaunchTimeStamp;
    public static final NpsPopupController INSTANCE = new NpsPopupController();
    private static long timeGap = 5184000000L;
    private static final Set<String> excludeActivityName = new LinkedHashSet();
    private static final Set<Class<? extends Activity>> excludeActivity = new LinkedHashSet();
    private static final Set<String> excludeActivityKeyword = SetsKt.mutableSetOf("Vip\\d{5,}[A-Z]Activity", "Detain\\d{5,}[A-Z]Activity", "Retain\\d{5,}[A-Z]Activity", "SnapTips\\d{5,}[A-Z]Activity", "LoginPolicyMemo\\d{5,}[A-Z]Activity", "Vip\\d{5,}TempActivity");

    private NpsPopupController() {
    }

    public final void init() {
        new AbtestGetVariableRequest(KEY_NPS_ABTEST).subscribe(new Consumer<Integer>() { // from class: com.glority.android.netpromoterscore.NpsPopupController$init$1
            @Override // io.reactivex.functions.Consumer
            public final void accept(Integer num) {
                Integer intOrNull;
                if (num != null) {
                    String result = new AbtestGetVariableDataRequest("nps_global", String.valueOf(num.intValue())).toResult();
                    int intValue = (result == null || (intOrNull = StringsKt.toIntOrNull(result)) == null) ? 60 : intOrNull.intValue();
                    NpsPopupController npsPopupController = NpsPopupController.INSTANCE;
                    NpsPopupController.timeGap = intValue * 86400000;
                }
                NpsPopupController.INSTANCE.initImpl();
            }
        }, new Consumer<Throwable>() { // from class: com.glority.android.netpromoterscore.NpsPopupController$init$2
            @Override // io.reactivex.functions.Consumer
            public final void accept(Throwable th) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.glority.android.netpromoterscore.NpsPopupController$init$2$runnable$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            NpsPopupController.INSTANCE.initImpl();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void initImpl() {
        appLaunchTimeStamp = System.currentTimeMillis();
        if (checkIfHitTimeGapCondition()) {
            PersistData.INSTANCE.set(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, Long.valueOf(calculateTimeShift()));
            long longValue = ((Number) PersistData.INSTANCE.get(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, 0L)).longValue();
            if (longValue <= 0) {
                PersistData.INSTANCE.set(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, Long.valueOf(calculateTimeShift()));
            } else if (longValue < 30000) {
                PersistData.INSTANCE.set(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, 30000L);
            }
            Observable.interval(10L, TimeUnit.SECONDS).subscribeOn(Schedulers.computation()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Consumer<Long>() { // from class: com.glority.android.netpromoterscore.NpsPopupController$initImpl$disposable$1
                @Override // io.reactivex.functions.Consumer
                public final void accept(Long l) {
                    PersistData.INSTANCE.set(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, Long.valueOf(((Number) PersistData.INSTANCE.get(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, 0L)).longValue() - WorkRequest.MIN_BACKOFF_MILLIS));
                }
            });
        } else {
            PersistData.INSTANCE.set(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, Long.MAX_VALUE);
        }
    }

    private final long calculateTimeShift() {
        long nextLong = RandomKt.nextLong(Random.INSTANCE, new LongRange(180000L, 480000L));
        NPSPersistKey.INSTANCE.setTimeShift(MathKt.roundToLong(((float) nextLong) / ((float) 1000)));
        LogUtils.e("Time shift is: " + nextLong + " ms");
        return nextLong;
    }

    public final void addExcludeActivity(Class<? extends Activity>... clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        CollectionsKt.addAll(excludeActivity, clazz);
    }

    public final void removeExcludeActivity(Class<? extends Activity>... clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        excludeActivity.removeAll(ArraysKt.toSet(clazz));
    }

    public final void addExcludeActivityName(String... name) {
        Intrinsics.checkNotNullParameter(name, "name");
        CollectionsKt.addAll(excludeActivityName, name);
    }

    public final void removeExcludeActivityName(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Iterator<String> it = excludeActivityName.iterator();
        while (it.hasNext()) {
            if (match(it.next(), name)) {
                it.remove();
            }
        }
    }

    public final boolean check(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return checkIfHitAbtestCondition() && checkIfHitTimeGapCondition() && !checkIfHitExcludeActivity(activity) && checkIfHitTimeShift() && !hasPoppedOther(activity);
    }

    public final void openNpsDialog(AppCompatActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        String simpleName = activity.getClass().getSimpleName();
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        int i = R.color.NpsStartColor;
        int i2 = R.color.NpsEndColor;
        PersistData.INSTANCE.set(NPSPersistKey.KEY_NPS_LAST_POP_TIME_STAMP, Long.valueOf(System.currentTimeMillis()));
        NetPromoterScoreDialog.INSTANCE.start(supportFragmentManager, i, i2, simpleName, NPSPersistKey.INSTANCE.getTimeShift());
    }

    private final boolean checkIfHitAbtestCondition() {
        Integer result = new AbtestGetVariableRequest(KEY_NPS_ABTEST).toResult();
        return result == null || result.intValue() != 0;
    }

    private final boolean checkIfHitExcludeActivity(AppCompatActivity activity) {
        Class<?> cls = activity.getClass();
        String activityName = activity.getClass().getName();
        if (excludeActivity.contains(cls)) {
            return true;
        }
        for (String str : excludeActivityName) {
            NpsPopupController npsPopupController = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(activityName, "activityName");
            if (npsPopupController.match(str, activityName)) {
                return true;
            }
        }
        String simpleName = cls.getSimpleName();
        for (String str2 : excludeActivityKeyword) {
            NpsPopupController npsPopupController2 = INSTANCE;
            Intrinsics.checkNotNullExpressionValue(simpleName, "simpleName");
            if (npsPopupController2.match(str2, simpleName)) {
                return true;
            }
        }
        return false;
    }

    private final boolean checkIfHitTimeShift() {
        return ((Number) PersistData.INSTANCE.get(NPSPersistKey.KEY_NPS_POP_SHIFT_TIME, 0L)).longValue() <= 0;
    }

    private final boolean checkIfHitTimeGapCondition() {
        return System.currentTimeMillis() - ((Number) PersistData.INSTANCE.get(NPSPersistKey.KEY_NPS_LAST_POP_TIME_STAMP, 0L)).longValue() > timeGap;
    }

    private final boolean hasPoppedOther(AppCompatActivity activity) {
        FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "activity.supportFragmentManager");
        List<Fragment> fragments = supportFragmentManager.getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "activity.supportFragmentManager.fragments");
        Iterator<T> it = fragments.iterator();
        while (it.hasNext()) {
            if (((Fragment) it.next()) instanceof DialogFragment) {
                return true;
            }
        }
        return false;
    }

    private final boolean match(String pattern, String value) {
        return Pattern.compile(pattern).matcher(value).matches();
    }
}
