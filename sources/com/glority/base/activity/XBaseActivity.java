package com.glority.base.activity;

import android.R;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.ui.base.BaseActivity;
import com.glority.base.utils.HandOnBundleUtils;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: XBaseActivity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0016\u001a\u00020\u0012H&J\u0015\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ\u0012\u0010\u0018\u001a\u00020\u00122\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\"\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0014H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u00028\u0000X\u0086.¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/glority/base/activity/XBaseActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/databinding/ViewDataBinding;", "Lcom/glority/android/ui/base/BaseActivity;", "<init>", "()V", "disabledAutoLogEvents", "", "", "getDisabledAutoLogEvents", "()Ljava/util/List;", "binding", "getBinding", "()Landroidx/databinding/ViewDataBinding;", "setBinding", "(Landroidx/databinding/ViewDataBinding;)V", "Landroidx/databinding/ViewDataBinding;", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "initData", "initView", "startActivity", "intent", "Landroid/content/Intent;", "startActivityForResult", "requestCode", "", "options", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class XBaseActivity<T extends ViewDataBinding> extends BaseActivity {
    public static final int $stable = 8;
    public T binding;

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
    }

    public abstract void initData();

    public abstract void initView(T binding);

    @Override // com.glority.android.ui.base.BaseActivity
    protected List<String> getDisabledAutoLogEvents() {
        return CollectionsKt.listOf((Object[]) new String[]{"show", "open", "hide", "close"});
    }

    public final T getBinding() {
        T t = this.binding;
        if (t != null) {
            return t;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    public final void setBinding(T t) {
        Intrinsics.checkNotNullParameter(t, "<set-?>");
        this.binding = t;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Set<String> keySet;
        Bundle handOnBundleFromBundle = HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(this);
        if (handOnBundleFromBundle != null && (keySet = handOnBundleFromBundle.keySet()) != null) {
            for (String str : keySet) {
                updateCommonEventArgs(TuplesKt.to(str, handOnBundleFromBundle.get(str)));
            }
        }
        super.onCreate(savedInstanceState);
        View findViewById = findViewById(R.id.content);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(...)");
        ViewDataBinding bind = DataBindingUtil.bind(((ViewGroup) findViewById).getChildAt(0));
        Intrinsics.checkNotNull(bind);
        setBinding(bind);
        initView(getBinding());
        initData();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        Bundle handOnBundleFromLast = HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, intent != null ? intent.getExtras() : null);
        if (handOnBundleFromLast != null && intent != null) {
            intent.putExtras(handOnBundleFromLast);
        }
        super.startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle handOnBundleFromLast = HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, intent.getExtras());
        if (handOnBundleFromLast != null) {
            intent.putExtras(handOnBundleFromLast);
        }
        super.startActivityForResult(intent, requestCode, options);
    }
}
