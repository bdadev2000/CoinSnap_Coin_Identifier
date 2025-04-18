package cat.ereza.customactivityoncrash.activity;

import a3.a;
import android.app.Application;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.plantcare.ai.identifier.plantid.R;
import h.m;
import y2.c;
import y2.d;
import z2.b;

/* loaded from: classes.dex */
public final class DefaultErrorActivity extends m {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f2780c = 0;

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.p, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(d.a);
        if (!obtainStyledAttributes.hasValue(117)) {
            setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
        }
        obtainStyledAttributes.recycle();
        setContentView(R.layout.customactivityoncrash_default_error_activity);
        Button button = (Button) findViewById(R.id.customactivityoncrash_error_activity_restart_button);
        Intent intent = getIntent();
        Application application = c.a;
        final a aVar = (a) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (aVar != null && intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") != null) {
            Log.e("CustomActivityOnCrash", "The previous app process crashed. This is the stack trace of the crash:\n" + intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        }
        if (aVar == null) {
            finish();
            return;
        }
        final int i10 = 0;
        if (aVar.f76b != null) {
            button.setText(R.string.customactivityoncrash_error_activity_restart_app);
            button.setOnClickListener(new View.OnClickListener(this) { // from class: z2.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DefaultErrorActivity f28466c;

                {
                    this.f28466c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i11 = i10;
                    a3.a aVar2 = aVar;
                    DefaultErrorActivity defaultErrorActivity = this.f28466c;
                    switch (i11) {
                        case 0:
                            int i12 = DefaultErrorActivity.f2780c;
                            defaultErrorActivity.getClass();
                            Application application2 = y2.c.a;
                            Intent intent2 = new Intent(defaultErrorActivity, (Class<?>) aVar2.f76b);
                            intent2.addFlags(270565376);
                            if (intent2.getComponent() != null) {
                                intent2.setAction("android.intent.action.MAIN");
                                intent2.addCategory("android.intent.category.LAUNCHER");
                            }
                            defaultErrorActivity.finish();
                            defaultErrorActivity.startActivity(intent2);
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                            return;
                        default:
                            int i13 = DefaultErrorActivity.f2780c;
                            defaultErrorActivity.getClass();
                            Application application3 = y2.c.a;
                            aVar2.getClass();
                            defaultErrorActivity.finish();
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                            return;
                    }
                }
            });
        } else {
            final int i11 = 1;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: z2.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DefaultErrorActivity f28466c;

                {
                    this.f28466c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i112 = i11;
                    a3.a aVar2 = aVar;
                    DefaultErrorActivity defaultErrorActivity = this.f28466c;
                    switch (i112) {
                        case 0:
                            int i12 = DefaultErrorActivity.f2780c;
                            defaultErrorActivity.getClass();
                            Application application2 = y2.c.a;
                            Intent intent2 = new Intent(defaultErrorActivity, (Class<?>) aVar2.f76b);
                            intent2.addFlags(270565376);
                            if (intent2.getComponent() != null) {
                                intent2.setAction("android.intent.action.MAIN");
                                intent2.addCategory("android.intent.category.LAUNCHER");
                            }
                            defaultErrorActivity.finish();
                            defaultErrorActivity.startActivity(intent2);
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                            return;
                        default:
                            int i13 = DefaultErrorActivity.f2780c;
                            defaultErrorActivity.getClass();
                            Application application3 = y2.c.a;
                            aVar2.getClass();
                            defaultErrorActivity.finish();
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                            return;
                    }
                }
            });
        }
        ((Button) findViewById(R.id.customactivityoncrash_error_activity_more_info_button)).setOnClickListener(new b(this, i10));
    }
}
