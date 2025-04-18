package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Process;
import androidx.profileinstaller.ProfileInstaller;
import java.io.File;

/* loaded from: classes3.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* loaded from: classes3.dex */
    public class ResultDiagnostics implements ProfileInstaller.DiagnosticsCallback {
        public ResultDiagnostics() {
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void a() {
            ((ProfileInstaller.AnonymousClass2) ProfileInstaller.f20892b).a();
        }

        @Override // androidx.profileinstaller.ProfileInstaller.DiagnosticsCallback
        public final void b(int i2, Object obj) {
            ((ProfileInstaller.AnonymousClass2) ProfileInstaller.f20892b).b(i2, obj);
            ProfileInstallReceiver.this.setResultCode(i2);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
            ProfileInstaller.b(context, new androidx.arch.core.executor.a(15), new ResultDiagnostics(), true);
            return;
        }
        if (!"androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
            if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
                ResultDiagnostics resultDiagnostics = new ResultDiagnostics();
                Process.sendSignal(Process.myPid(), 10);
                resultDiagnostics.b(12, null);
                return;
            } else {
                if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
                    return;
                }
                String string = extras.getString("EXTRA_BENCHMARK_OPERATION");
                ResultDiagnostics resultDiagnostics2 = new ResultDiagnostics();
                if (!"DROP_SHADER_CACHE".equals(string)) {
                    resultDiagnostics2.b(16, null);
                    return;
                } else if (BenchmarkOperation.a(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
                    resultDiagnostics2.b(14, null);
                    return;
                } else {
                    resultDiagnostics2.b(15, null);
                    return;
                }
            }
        }
        Bundle extras2 = intent.getExtras();
        if (extras2 != null) {
            String string2 = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
            if (!"WRITE_SKIP_FILE".equals(string2)) {
                if ("DELETE_SKIP_FILE".equals(string2)) {
                    ResultDiagnostics resultDiagnostics3 = new ResultDiagnostics();
                    new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
                    new a(11, resultDiagnostics3, null, 1).run();
                    return;
                }
                return;
            }
            androidx.arch.core.executor.a aVar = new androidx.arch.core.executor.a(16);
            ResultDiagnostics resultDiagnostics4 = new ResultDiagnostics();
            try {
                ProfileInstaller.a(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
                aVar.execute(new a(10, resultDiagnostics4, null, 1));
            } catch (PackageManager.NameNotFoundException e) {
                aVar.execute(new a(7, resultDiagnostics4, e, 1));
            }
        }
    }
}
