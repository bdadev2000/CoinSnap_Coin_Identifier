package com.glority.base.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.FragmentManager;
import androidx.viewbinding.ViewBinding;
import com.glority.base.presenter.IResultManager;
import com.glority.base.utils.HandOnBundleUtils;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseFragment.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH$J\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001f\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014¢\u0006\u0002\u0010\u001cJ\"\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\b\u0010\"\u001a\u00020\u0011H\u0016J\u0010\u0010#\u001a\u00020\u00112\u0006\u0010$\u001a\u00020!H\u0016J\"\u0010%\u001a\u00020\u00112\u0006\u0010$\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\b2\b\u0010&\u001a\u0004\u0018\u00010\u0013H\u0016R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006'"}, d2 = {"Lcom/glority/base/fragment/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Lcom/glority/android/ui/base/v2/BaseFragment;", "Lcom/glority/base/presenter/IResultManager;", "<init>", "()V", "getLayoutId", "", "getSupportFragmentManager", "Landroidx/fragment/app/FragmentManager;", "resultListenerMap", "", "Lcom/glority/base/presenter/IResultManager$OnResultListener;", "getResultListenerMap", "()Ljava/util/Map;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "getViewBinding", "inflater", "Landroid/view/LayoutInflater;", TtmlNode.RUBY_CONTAINER, "Landroid/view/ViewGroup;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroyView", "startActivity", "intent", "startActivityForResult", "options", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class BaseFragment<VB extends ViewBinding> extends com.glority.android.ui.base.v2.BaseFragment<VB> implements IResultManager {
    public static final int $stable = 8;
    private final Map<Integer, IResultManager.OnResultListener> resultListenerMap = new LinkedHashMap();

    protected abstract int getLayoutId();

    @Override // com.glority.base.presenter.IResultManager
    public void putResultListener(int i, IResultManager.OnResultListener onResultListener) {
        IResultManager.DefaultImpls.putResultListener(this, i, onResultListener);
    }

    @Override // com.glority.base.presenter.IResultManager
    public void requestResult(Intent intent, int i, IResultManager.OnResultListener onResultListener) {
        IResultManager.DefaultImpls.requestResult(this, intent, i, onResultListener);
    }

    public final FragmentManager getSupportFragmentManager() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        return childFragmentManager;
    }

    @Override // com.glority.base.presenter.IResultManager
    public Map<Integer, IResultManager.OnResultListener> getResultListenerMap() {
        return this.resultListenerMap;
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        Set<String> keySet;
        Bundle handOnBundleFromBundle = HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(this);
        if (handOnBundleFromBundle != null && (keySet = handOnBundleFromBundle.keySet()) != null) {
            for (String str : keySet) {
                updateCommonEventArgs(TuplesKt.to(str, handOnBundleFromBundle.get(str)));
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
    }

    @Override // com.glority.android.ui.base.v2.BaseFragment
    protected VB getViewBinding(LayoutInflater inflater, ViewGroup container) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        return DataBindingUtil.inflate(inflater, getLayoutId(), container, false);
    }

    @Override // androidx.fragment.app.Fragment, com.glority.base.presenter.IResultManager
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IResultManager.DefaultImpls.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivity(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle handOnBundleFromLast = HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, intent.getExtras());
        if (handOnBundleFromLast != null) {
            intent.putExtras(handOnBundleFromLast);
        }
        super.startActivity(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle handOnBundleFromLast = HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, intent.getExtras());
        if (handOnBundleFromLast != null) {
            intent.putExtras(handOnBundleFromLast);
        }
        super.startActivityForResult(intent, requestCode, options);
    }
}
