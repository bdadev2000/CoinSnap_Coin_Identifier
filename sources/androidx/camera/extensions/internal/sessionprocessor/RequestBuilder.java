package androidx.camera.extensions.internal.sessionprocessor;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.RequestProcessor;
import androidx.camera.extensions.internal.RequestOptionConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
class RequestBuilder {
    int mCaptureStageId;
    private List<Integer> mTargetOutputConfigIds = new ArrayList();
    private Map<CaptureRequest.Key<?>, Object> mParameters = new HashMap();
    private int mTemplateId = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestBuilder addTargetOutputConfigIds(int i) {
        this.mTargetOutputConfigIds.add(Integer.valueOf(i));
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestBuilder setParameters(CaptureRequest.Key<?> key, Object obj) {
        this.mParameters.put(key, obj);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestBuilder setTemplateId(int i) {
        this.mTemplateId = i;
        return this;
    }

    public RequestBuilder setCaptureStageId(int i) {
        this.mCaptureStageId = i;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RequestProcessor.Request build() {
        return new RequestProcessorRequest(this.mTargetOutputConfigIds, this.mParameters, this.mTemplateId, this.mCaptureStageId);
    }

    /* loaded from: classes.dex */
    static class RequestProcessorRequest implements RequestProcessor.Request {
        final int mCaptureStageId;
        final Config mParameterConfig;
        final List<Integer> mTargetOutputConfigIds;
        final int mTemplateId;

        RequestProcessorRequest(List<Integer> list, Map<CaptureRequest.Key<?>, Object> map, int i, int i2) {
            this.mTargetOutputConfigIds = list;
            this.mTemplateId = i;
            this.mCaptureStageId = i2;
            RequestOptionConfig.Builder builder = new RequestOptionConfig.Builder();
            for (CaptureRequest.Key<?> key : map.keySet()) {
                builder.setCaptureRequestOption(key, map.get(key));
            }
            this.mParameterConfig = builder.build();
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public List<Integer> getTargetOutputConfigIds() {
            return this.mTargetOutputConfigIds;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public Config getParameters() {
            return this.mParameterConfig;
        }

        @Override // androidx.camera.core.impl.RequestProcessor.Request
        public int getTemplateId() {
            return this.mTemplateId;
        }

        public int getCaptureStageId() {
            return this.mCaptureStageId;
        }
    }
}
