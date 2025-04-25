package com.glority.base.presenter;

import android.content.Intent;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: IResultManager.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\bf\u0018\u00002\u00020\u0001:\u0002\u0015\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H&J\"\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010\u0010\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0005H\u0016J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0004H\u0002J\"\u0010\u0014\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0002R\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/glority/base/presenter/IResultManager;", "", "resultListenerMap", "", "", "Lcom/glority/base/presenter/IResultManager$OnResultListener;", "getResultListenerMap", "()Ljava/util/Map;", "startActivityForResult", "", "intent", "Landroid/content/Intent;", "requestCode", "onActivityResult", "resultCode", "data", "requestResult", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "putResultListener", "getResultListener", "notifyOnActivityResult", "OnResultListener", "OnResultOKListener", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public interface IResultManager {

    /* compiled from: IResultManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¨\u0006\b"}, d2 = {"Lcom/glority/base/presenter/IResultManager$OnResultListener;", "", "onResult", "", "resultCode", "", "data", "Landroid/content/Intent;", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface OnResultListener {
        void onResult(int resultCode, Intent data);
    }

    Map<Integer, OnResultListener> getResultListenerMap();

    void onActivityResult(int requestCode, int resultCode, Intent data);

    void putResultListener(int requestCode, OnResultListener listener);

    void requestResult(Intent intent, int requestCode, OnResultListener listener);

    void startActivityForResult(Intent intent, int requestCode);

    /* compiled from: IResultManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public static final class DefaultImpls {
        public static void onActivityResult(IResultManager iResultManager, int i, int i2, Intent intent) {
            notifyOnActivityResult(iResultManager, i, i2, intent);
        }

        public static void requestResult(IResultManager iResultManager, Intent intent, int i, OnResultListener listener) {
            Intrinsics.checkNotNullParameter(intent, "intent");
            Intrinsics.checkNotNullParameter(listener, "listener");
            iResultManager.getResultListenerMap().put(Integer.valueOf(i), listener);
            iResultManager.startActivityForResult(intent, i);
        }

        public static void putResultListener(IResultManager iResultManager, int i, OnResultListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            iResultManager.getResultListenerMap().put(Integer.valueOf(i), listener);
        }

        private static OnResultListener getResultListener(IResultManager iResultManager, int i) {
            if (iResultManager.getResultListenerMap().containsKey(Integer.valueOf(i))) {
                return iResultManager.getResultListenerMap().get(Integer.valueOf(i));
            }
            return null;
        }

        private static void notifyOnActivityResult(IResultManager iResultManager, int i, int i2, Intent intent) {
            OnResultListener resultListener = getResultListener(iResultManager, i);
            if (resultListener != null) {
                resultListener.onResult(i2, intent);
            }
        }
    }

    /* compiled from: IResultManager.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/glority/base/presenter/IResultManager$OnResultOKListener;", "Lcom/glority/base/presenter/IResultManager$OnResultListener;", "onResult", "", "data", "Landroid/content/Intent;", "resultCode", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
    /* loaded from: classes6.dex */
    public interface OnResultOKListener extends OnResultListener {
        @Override // com.glority.base.presenter.IResultManager.OnResultListener
        void onResult(int resultCode, Intent data);

        void onResult(Intent data);

        /* compiled from: IResultManager.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 82)
        /* loaded from: classes6.dex */
        public static final class DefaultImpls {
            public static void onResult(OnResultOKListener onResultOKListener, int i, Intent intent) {
                if (i == -1) {
                    onResultOKListener.onResult(intent);
                }
            }
        }
    }
}
