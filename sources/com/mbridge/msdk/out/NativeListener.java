package com.mbridge.msdk.out;

import java.util.List;

/* loaded from: classes3.dex */
public class NativeListener {

    /* loaded from: classes3.dex */
    public interface FilpListener {
        void filpEvent(int i9);
    }

    /* loaded from: classes3.dex */
    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i9);

        void onLoggingImpression(int i9);
    }

    /* loaded from: classes3.dex */
    public interface NativeTrackingListener extends BaseTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i9);

        void onDownloadStart(Campaign campaign);

        boolean onInterceptDefaultLoadingDialog();

        void onShowLoading(Campaign campaign);
    }

    /* loaded from: classes3.dex */
    public static class Template {
        private int adNum;
        private int id;

        public Template(int i9, int i10) {
            this.id = i9;
            this.adNum = i10;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public int getId() {
            return this.id;
        }

        public void setAdNum(int i9) {
            this.adNum = i9;
        }

        public void setId(int i9) {
            this.id = i9;
        }
    }

    /* loaded from: classes3.dex */
    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }
}
