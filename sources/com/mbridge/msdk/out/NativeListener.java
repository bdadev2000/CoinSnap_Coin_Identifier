package com.mbridge.msdk.out;

import java.util.List;

/* loaded from: classes4.dex */
public class NativeListener {

    /* loaded from: classes4.dex */
    public interface FilpListener {
        void filpEvent(int i10);
    }

    /* loaded from: classes4.dex */
    public interface NativeAdListener {
        void onAdClick(Campaign campaign);

        void onAdFramesLoaded(List<Frame> list);

        void onAdLoadError(String str);

        void onAdLoaded(List<Campaign> list, int i10);

        void onLoggingImpression(int i10);
    }

    /* loaded from: classes4.dex */
    public interface NativeTrackingListener extends BaseTrackingListener {
        void onDismissLoading(Campaign campaign);

        void onDownloadFinish(Campaign campaign);

        void onDownloadProgress(int i10);

        void onDownloadStart(Campaign campaign);

        boolean onInterceptDefaultLoadingDialog();

        void onShowLoading(Campaign campaign);
    }

    /* loaded from: classes4.dex */
    public static class Template {
        private int adNum;

        /* renamed from: id, reason: collision with root package name */
        private int f14723id;

        public Template(int i10, int i11) {
            this.f14723id = i10;
            this.adNum = i11;
        }

        public int getAdNum() {
            return this.adNum;
        }

        public int getId() {
            return this.f14723id;
        }

        public void setAdNum(int i10) {
            this.adNum = i10;
        }

        public void setId(int i10) {
            this.f14723id = i10;
        }
    }

    /* loaded from: classes4.dex */
    public interface TrackingExListener extends NativeTrackingListener {
        void onLeaveApp();
    }
}
