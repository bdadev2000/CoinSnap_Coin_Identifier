package com.mbridge.msdk.foundation.download.download;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.b.e;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ab;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public class ResDownloadCheckManager {
    private static ConcurrentHashMap<String, Boolean> recordImageMap = new ConcurrentHashMap<>();
    private ConcurrentHashMap<String, Boolean> campaignStateMap;
    private ConcurrentHashMap<String, Boolean> preLoadSuccessedMap;
    private ConcurrentHashMap<String, Boolean> recordVideoMap;
    private ConcurrentHashMap<String, Boolean> recordZipMap;

    /* loaded from: classes4.dex */
    public static final class Holder {
        public static ResDownloadCheckManager instance = new ResDownloadCheckManager();

        private Holder() {
        }
    }

    private void addImageUrlToMap(List<String> list) {
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        if (list != null && list.size() != 0) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str) && (concurrentHashMap = recordImageMap) != null && !concurrentHashMap.containsKey(str)) {
                    boolean b3 = b.a(c.m().c()).b(str);
                    if (!TextUtils.isEmpty(str)) {
                        recordImageMap.put(str, Boolean.valueOf(b3));
                    }
                }
            }
        }
    }

    private void addUrlToMap(CampaignEx campaignEx) {
        List<CampaignEx.c.a> a;
        ConcurrentHashMap<String, Boolean> concurrentHashMap;
        ConcurrentHashMap<String, Boolean> concurrentHashMap2;
        if (campaignEx != null) {
            String videoUrlEncode = campaignEx.getVideoUrlEncode();
            if (!TextUtils.isEmpty(videoUrlEncode) && (concurrentHashMap2 = this.recordVideoMap) != null && !concurrentHashMap2.containsKey(videoUrlEncode)) {
                this.recordVideoMap.put(videoUrlEncode, Boolean.FALSE);
            }
            String str = campaignEx.getendcard_url();
            if (!TextUtils.isEmpty(str) && (concurrentHashMap = this.recordZipMap) != null && !concurrentHashMap.containsKey(str)) {
                this.recordZipMap.put(str, Boolean.FALSE);
            }
            CampaignEx.c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            if (rewardTemplateMode != null && (a = rewardTemplateMode.a()) != null) {
                for (CampaignEx.c.a aVar : a) {
                    if (aVar != null) {
                        addImageUrlToMap(aVar.a);
                    }
                }
            }
        }
    }

    private boolean checkImageUrlState(boolean z10, String str) {
        boolean checkState = checkState(recordImageMap, str);
        if (checkState || b.a(c.m().c()).b(str)) {
            return true;
        }
        return checkState;
    }

    private boolean checkState(ConcurrentHashMap<String, Boolean> concurrentHashMap, String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (concurrentHashMap != null) {
            if (concurrentHashMap.containsKey(str)) {
                return concurrentHashMap.get(str).booleanValue();
            }
            concurrentHashMap.put(str, Boolean.FALSE);
            return false;
        }
        new ConcurrentHashMap().put(str, Boolean.FALSE);
        return false;
    }

    private boolean checkZipState(boolean z10, String str) {
        boolean checkState = checkState(this.recordZipMap, str);
        if (checkState) {
            return checkState;
        }
        if (z10 && !TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str))) {
            this.recordZipMap.put(str, Boolean.TRUE);
            return true;
        }
        return checkState;
    }

    public static ResDownloadCheckManager getInstance() {
        return Holder.instance;
    }

    private boolean getIsEffectivePath(String str) {
        String c10 = ab.c(str);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e.a(com.mbridge.msdk.foundation.same.b.c.MBRIDGE_VC));
        File file = new File(vd.e.h(sb2, File.separator, c10));
        try {
            if (!file.exists() || !file.isFile()) {
                return false;
            }
            if (!file.canRead()) {
                return false;
            }
            return true;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void updateCampaignState(String str, boolean z10) {
        if (this.campaignStateMap == null) {
            this.campaignStateMap = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            this.campaignStateMap.put(str, Boolean.valueOf(z10));
        }
    }

    public boolean checkImageState(boolean z10, CampaignEx.c cVar) {
        List<CampaignEx.c.a> a;
        List<String> list;
        if (cVar != null && (a = cVar.a()) != null) {
            for (CampaignEx.c.a aVar : a) {
                if (aVar != null && (list = aVar.a) != null) {
                    Iterator<String> it = list.iterator();
                    while (it.hasNext()) {
                        if (!checkImageUrlState(z10, it.next())) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean checkPreLoadState(String str) {
        if (TextUtils.isEmpty(str) || !this.preLoadSuccessedMap.containsKey(str)) {
            return false;
        }
        return this.preLoadSuccessedMap.get(str).booleanValue();
    }

    public boolean containsVideoKey(String str) {
        if (this.recordVideoMap != null && !TextUtils.isEmpty(str) && this.recordVideoMap.containsKey(str)) {
            return this.recordVideoMap.get(str).booleanValue();
        }
        return false;
    }

    public boolean containsZipKey(String str) {
        if (this.recordZipMap != null && !TextUtils.isEmpty(str) && this.recordZipMap.containsKey(str)) {
            return this.recordZipMap.get(str).booleanValue();
        }
        return false;
    }

    public void removePreLoadState(String str) {
        if (this.preLoadSuccessedMap.containsKey(str)) {
            this.preLoadSuccessedMap.remove(str);
        }
    }

    public void setCampaignList(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() == 0) {
            return;
        }
        Iterator<CampaignEx> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            CampaignEx next = it.next();
            if (next != null) {
                addUrlToMap(next);
                updateCampaignState(next.getId(), false);
            }
        }
    }

    public void setImageDownloadDone(String str, boolean z10) {
        if (recordImageMap == null) {
            recordImageMap = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            recordImageMap.put(str, Boolean.valueOf(z10));
        }
    }

    public void setTemplatePreLoadDone(String str, boolean z10) {
        if (this.preLoadSuccessedMap == null) {
            this.preLoadSuccessedMap = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            this.preLoadSuccessedMap.put(str, Boolean.valueOf(z10));
        }
    }

    public void setVideoDownloadDone(String str, boolean z10) {
        if (this.recordVideoMap == null) {
            this.recordVideoMap = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            this.recordVideoMap.put(str, Boolean.valueOf(z10));
        }
    }

    public void setZipDownloadDone(String str, boolean z10) {
        if (this.recordZipMap == null) {
            this.recordZipMap = new ConcurrentHashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            this.recordZipMap.put(str, Boolean.valueOf(z10));
        }
    }

    private ResDownloadCheckManager() {
        this.campaignStateMap = new ConcurrentHashMap<>();
        this.preLoadSuccessedMap = new ConcurrentHashMap<>();
        this.recordVideoMap = new ConcurrentHashMap<>();
        this.recordZipMap = new ConcurrentHashMap<>();
    }

    public void setCampaignList(CampaignEx campaignEx) {
        if (campaignEx != null) {
            addUrlToMap(campaignEx);
            updateCampaignState(campaignEx.getId(), false);
        }
    }
}
