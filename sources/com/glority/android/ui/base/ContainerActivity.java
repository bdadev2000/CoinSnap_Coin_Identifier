package com.glority.android.ui.base;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResultCaller;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import com.glority.android.ui.R;
import com.glority.android.ui.base.FragmentHelper;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ContainerActivity.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u000fH\u0016J\b\u0010\u0013\u001a\u00020\tH\u0014J\b\u0010\u0014\u001a\u00020\u0005H\u0014J\"\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u000fH\u0016J\u0010\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0004R\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/glority/android/ui/base/ContainerActivity;", "Lcom/glority/android/ui/base/BaseActivity;", "()V", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "exitAnim", "", "getExitAnim", "()I", "setExitAnim", "(I)V", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "finish", "getLayoutId", "getLogPageName", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "toFragment", "fragment", "Landroidx/fragment/app/Fragment;", "Companion", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public class ContainerActivity extends BaseActivity {
    public static final String ACTION_OPEN_FRAGMENT = "__action_open_fragment";
    public static final String ACTION_OPEN_FRAGMENT_EXTRA_BUNDLE = "__action_open_fragment_extra_bundle";
    public static final String ACTION_OPEN_FRAGMENT_EXTRA_CLASS = "__action_open_fragment_extra_class";

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int exitAnim;

    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    public final int getExitAnim() {
        return this.exitAnim;
    }

    public final void setExitAnim(int i) {
        this.exitAnim = i;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected List<String> getDisabledAutoLogEvents() {
        return CollectionsKt.listOf((Object[]) new String[]{"open", "close"});
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_container;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "";
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        if (Intrinsics.areEqual(ACTION_OPEN_FRAGMENT, getIntent().getAction())) {
            Serializable serializableExtra = getIntent().getSerializableExtra(ACTION_OPEN_FRAGMENT_EXTRA_CLASS);
            if (serializableExtra == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.Fragment>");
            }
            Class cls = (Class) serializableExtra;
            Bundle bundleExtra = getIntent().getBundleExtra(ACTION_OPEN_FRAGMENT_EXTRA_BUNDLE);
            try {
                Fragment fragment = (Fragment) cls.newInstance();
                fragment.setArguments(bundleExtra);
                Intrinsics.checkNotNullExpressionValue(fragment, "fragment");
                toFragment(fragment);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ActivityResultCaller currentFragment = getCurrentFragment(R.id.fl_container);
        if ((currentFragment instanceof BackEventResolver) && ((BackEventResolver) currentFragment).resolveBackEvent()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        int i = this.exitAnim;
        if (i != 0) {
            overridePendingTransition(0, i);
        }
    }

    protected final void toFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FragmentHelper.INSTANCE.replace(this, fragment, R.id.fl_container, false);
    }

    /* compiled from: ContainerActivity.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\t0\b\"\n\b\u0000\u0010\t*\u0004\u0018\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\t0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/android/ui/base/ContainerActivity$Companion;", "", "()V", "ACTION_OPEN_FRAGMENT", "", "ACTION_OPEN_FRAGMENT_EXTRA_BUNDLE", "ACTION_OPEN_FRAGMENT_EXTRA_CLASS", "open", "Lcom/glority/android/ui/base/FragmentHelper$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/fragment/app/Fragment;", "withClz", "Ljava/lang/Class;", "mod_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final <T extends Fragment> FragmentHelper.Builder<T> open(Class<T> withClz) {
            Intrinsics.checkNotNullParameter(withClz, "withClz");
            return new FragmentHelper.Builder<>(withClz);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Fragment currentFragment = getCurrentFragment(R.id.fl_container);
        if (currentFragment == null) {
            return;
        }
        currentFragment.onActivityResult(requestCode, requestCode, data);
    }
}
