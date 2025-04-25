package com.glority.android.core.app;

import android.app.ActivityManager;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.multidex.MultiDexApplication;
import com.glority.abtest.InitAbtest;
import com.glority.analysis.InitAnalysis;
import com.glority.android.adjust.InitAdjust;
import com.glority.android.base.agreement.InitAgreement;
import com.glority.android.base.aws.InitAws;
import com.glority.android.core.init.InitGrade;
import com.glority.android.core.init.InitTask;
import com.glority.android.core.route.RouteableActivity;
import com.glority.android.detection.PreInstallTfTask;
import com.glority.android.international.firebase.InitFirebase;
import com.glority.android.ui.InitUi;
import com.glority.billing.InitBilling;
import com.google.gson.JsonObject;
import io.reactivex.Observable;
import io.reactivex.functions.Action;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes7.dex */
public class GlApplication extends MultiDexApplication {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static PublishSubject<Boolean> AuthSubject = PublishSubject.create();
    private static ArrayList<Class> inited = new ArrayList<>();
    private static ArrayList<InitTask> frontInit = new ArrayList<>();
    private static ArrayList<InitTask> backgroundInit = new ArrayList<>();
    private static ArrayList<InitTask> delayInit = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: protected */
    public int getPushIcon() {
        return 0;
    }

    static {
        registerInit(new PreInstallTfTask());
        registerInit(new InitAnalysis());
        registerInit(new InitAbtest());
        registerInit(new InitBilling());
        registerInit(new InitAgreement());
        registerInit(new InitAdjust());
        registerInit(new InitUi());
        registerInit(new InitFirebase());
        registerInit(new InitAws());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String getChannel() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public JsonObject getBuildConfig() {
        return new JsonObject();
    }

    public static void registerInit(InitTask initTask) {
        int grade = initTask.getGrade();
        if (grade == 1) {
            frontInit.add(initTask);
        } else if (grade == 2) {
            delayInit.add(initTask);
        } else {
            backgroundInit.add(initTask);
        }
    }

    private void executeInit(ArrayList<InitTask> arrayList) {
        try {
            Iterator<InitTask> it = arrayList.iterator();
            while (it.hasNext()) {
                executeTask(it.next());
            }
        } catch (Exception unused) {
        }
    }

    private void executeTask(InitTask initTask) {
        List<InitTask> preconditions = initTask.getPreconditions();
        if (preconditions != null) {
            Iterator<InitTask> it = preconditions.iterator();
            while (it.hasNext()) {
                executeTask(it.next());
            }
        }
        if (inited.contains(initTask.getClass())) {
            return;
        }
        initTask.run();
        inited.add(initTask.getClass());
    }

    @Override // android.app.Application
    public void onCreate() {
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true);
        ProcessLifecycleOwner.get().getLifecycle().addObserver(new RouteableActivity.ApplicationObserver());
        super.onCreate();
        if (isMainProcess()) {
            AppContext.INSTANCE.init(this);
            executeInit(frontInit);
            Observable.empty().observeOn(Schedulers.newThread()).doOnComplete(new Action() { // from class: com.glority.android.core.app.GlApplication$$ExternalSyntheticLambda0
                @Override // io.reactivex.functions.Action
                public final void run() {
                    GlApplication.this.m7735lambda$onCreate$0$comglorityandroidcoreappGlApplication();
                }
            }).subscribe();
            InitGrade.INSTANCE.isPrivacyAgreed().observeForever(new Observer() { // from class: com.glority.android.core.app.GlApplication$$ExternalSyntheticLambda1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    GlApplication.this.m7736lambda$onCreate$1$comglorityandroidcoreappGlApplication((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$0$com-glority-android-core-app-GlApplication, reason: not valid java name */
    public /* synthetic */ void m7735lambda$onCreate$0$comglorityandroidcoreappGlApplication() throws Exception {
        executeInit(backgroundInit);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: lambda$onCreate$1$com-glority-android-core-app-GlApplication, reason: not valid java name */
    public /* synthetic */ void m7736lambda$onCreate$1$comglorityandroidcoreappGlApplication(Boolean bool) {
        if (bool.booleanValue()) {
            executeInit(delayInit);
        }
    }

    protected boolean isMainProcess() {
        return isProcess("");
    }

    protected boolean isProcess(String str) {
        String currentProcessName = getCurrentProcessName();
        if (TextUtils.isEmpty(str)) {
            return !currentProcessName.contains(":");
        }
        return currentProcessName.contains(":" + str);
    }

    protected String getCurrentProcessName() {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        int myPid = Process.myPid();
        try {
            runningAppProcesses = ((ActivityManager) getSystemService("activity")).getRunningAppProcesses();
        } catch (Exception e) {
            Log.e(getClass().getSimpleName(), e.toString());
        }
        if (runningAppProcesses == null) {
            return "";
        }
        for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
            if (runningAppProcessInfo.pid == myPid) {
                return runningAppProcessInfo.processName;
            }
        }
        return "";
    }
}
