package cat.ereza.customactivityoncrash.activity;

import A6.c;
import android.app.Application;
import android.content.Intent;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import cat.ereza.customactivityoncrash.activity.DefaultErrorActivity;
import com.tools.arruler.photomeasure.camera.ruler.R;
import i1.AbstractC2337c;
import i1.d;
import k.AbstractActivityC2417f;
import k1.C2428a;

/* loaded from: classes.dex */
public final class DefaultErrorActivity extends AbstractActivityC2417f {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f5457c = 0;

    @Override // androidx.fragment.app.FragmentActivity, f.l, androidx.core.app.AbstractActivityC0412m, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TypedArray obtainStyledAttributes = obtainStyledAttributes(d.f20640a);
        if (!obtainStyledAttributes.hasValue(117)) {
            setTheme(R.style.Theme_AppCompat_Light_DarkActionBar);
        }
        obtainStyledAttributes.recycle();
        setContentView(R.layout.customactivityoncrash_default_error_activity);
        Button button = (Button) findViewById(R.id.customactivityoncrash_error_activity_restart_button);
        Intent intent = getIntent();
        Application application = AbstractC2337c.f20638a;
        final C2428a c2428a = (C2428a) intent.getSerializableExtra("cat.ereza.customactivityoncrash.EXTRA_CONFIG");
        if (c2428a != null && intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE") != null) {
            Log.e("CustomActivityOnCrash", "The previous app process crashed. This is the stack trace of the crash:\n" + intent.getStringExtra("cat.ereza.customactivityoncrash.EXTRA_STACK_TRACE"));
        }
        if (c2428a == null) {
            finish();
            return;
        }
        if (c2428a.b != null) {
            button.setText(R.string.customactivityoncrash_error_activity_restart_app);
            final int i9 = 0;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: j1.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DefaultErrorActivity f21011c;

                {
                    this.f21011c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2428a c2428a2 = c2428a;
                    DefaultErrorActivity defaultErrorActivity = this.f21011c;
                    switch (i9) {
                        case 0:
                            int i10 = DefaultErrorActivity.f5457c;
                            defaultErrorActivity.getClass();
                            Application application2 = AbstractC2337c.f20638a;
                            Intent intent2 = new Intent(defaultErrorActivity, (Class<?>) c2428a2.b);
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
                            int i11 = DefaultErrorActivity.f5457c;
                            defaultErrorActivity.getClass();
                            Application application3 = AbstractC2337c.f20638a;
                            c2428a2.getClass();
                            defaultErrorActivity.finish();
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                            return;
                    }
                }
            });
        } else {
            final int i10 = 1;
            button.setOnClickListener(new View.OnClickListener(this) { // from class: j1.a

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ DefaultErrorActivity f21011c;

                {
                    this.f21011c = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C2428a c2428a2 = c2428a;
                    DefaultErrorActivity defaultErrorActivity = this.f21011c;
                    switch (i10) {
                        case 0:
                            int i102 = DefaultErrorActivity.f5457c;
                            defaultErrorActivity.getClass();
                            Application application2 = AbstractC2337c.f20638a;
                            Intent intent2 = new Intent(defaultErrorActivity, (Class<?>) c2428a2.b);
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
                            int i11 = DefaultErrorActivity.f5457c;
                            defaultErrorActivity.getClass();
                            Application application3 = AbstractC2337c.f20638a;
                            c2428a2.getClass();
                            defaultErrorActivity.finish();
                            Process.killProcess(Process.myPid());
                            System.exit(10);
                            return;
                    }
                }
            });
        }
        ((Button) findViewById(R.id.customactivityoncrash_error_activity_more_info_button)).setOnClickListener(new c(this, 11));
    }
}
