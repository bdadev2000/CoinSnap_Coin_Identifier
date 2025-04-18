package com.mbridge.msdk.playercommon.exoplayer2.drm;

import a4.j;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionEventListener;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmInitData;
import com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto;
import com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.mp4.PsshAtomUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes4.dex */
public class DefaultDrmSessionManager<T extends ExoMediaCrypto> implements DefaultDrmSession.ProvisioningManager<T>, DrmSessionManager<T> {
    public static final int INITIAL_DRM_REQUEST_RETRY_COUNT = 3;
    public static final int MODE_DOWNLOAD = 2;
    public static final int MODE_PLAYBACK = 0;
    public static final int MODE_QUERY = 1;
    public static final int MODE_RELEASE = 3;
    public static final String PLAYREADY_CUSTOM_DATA_KEY = "PRCustomData";
    private static final String TAG = "DefaultDrmSessionMgr";
    private final MediaDrmCallback callback;
    private final DefaultDrmSessionEventListener.EventDispatcher eventDispatcher;
    private final int initialDrmRequestRetryCount;
    private final ExoMediaDrm<T> mediaDrm;
    volatile DefaultDrmSessionManager<T>.MediaDrmHandler mediaDrmHandler;
    private int mode;
    private final boolean multiSession;
    private byte[] offlineLicenseKeySetId;
    private final HashMap<String, String> optionalKeyRequestParameters;
    private Looper playbackLooper;
    private final List<DefaultDrmSession<T>> provisioningSessions;
    private final List<DefaultDrmSession<T>> sessions;
    private final UUID uuid;

    /* loaded from: classes4.dex */
    public interface EventListener extends DefaultDrmSessionEventListener {
    }

    /* loaded from: classes4.dex */
    public class MediaDrmEventListener implements ExoMediaDrm.OnEventListener<T> {
        private MediaDrmEventListener() {
        }

        @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaDrm.OnEventListener
        public void onEvent(ExoMediaDrm<? extends T> exoMediaDrm, byte[] bArr, int i10, int i11, byte[] bArr2) {
            if (DefaultDrmSessionManager.this.mode == 0) {
                DefaultDrmSessionManager.this.mediaDrmHandler.obtainMessage(i10, bArr).sendToTarget();
            }
        }
    }

    /* loaded from: classes4.dex */
    public class MediaDrmHandler extends Handler {
        public MediaDrmHandler(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            for (DefaultDrmSession defaultDrmSession : DefaultDrmSessionManager.this.sessions) {
                if (defaultDrmSession.hasSessionId(bArr)) {
                    defaultDrmSession.onMediaDrmEvent(message.what);
                    return;
                }
            }
        }
    }

    /* loaded from: classes4.dex */
    public static final class MissingSchemeDataException extends Exception {
        private MissingSchemeDataException(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* loaded from: classes4.dex */
    public @interface Mode {
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this(uuid, exoMediaDrm, mediaDrmCallback, hashMap);
        if (handler == null || defaultDrmSessionEventListener == null) {
            return;
        }
        addListener(handler, defaultDrmSessionEventListener);
    }

    private static DrmInitData.SchemeData getSchemeData(DrmInitData drmInitData, UUID uuid, boolean z10) {
        int i10;
        ArrayList arrayList = new ArrayList(drmInitData.schemeDataCount);
        int i11 = 0;
        while (true) {
            boolean z11 = true;
            if (i11 >= drmInitData.schemeDataCount) {
                break;
            }
            DrmInitData.SchemeData schemeData = drmInitData.get(i11);
            if (!schemeData.matches(uuid) && (!C.CLEARKEY_UUID.equals(uuid) || !schemeData.matches(C.COMMON_PSSH_UUID))) {
                z11 = false;
            }
            if (z11 && (schemeData.data != null || z10)) {
                arrayList.add(schemeData);
            }
            i11++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (C.WIDEVINE_UUID.equals(uuid)) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                DrmInitData.SchemeData schemeData2 = (DrmInitData.SchemeData) arrayList.get(i12);
                if (schemeData2.hasData()) {
                    i10 = PsshAtomUtil.parseVersion(schemeData2.data);
                } else {
                    i10 = -1;
                }
                int i13 = Util.SDK_INT;
                if (i13 < 23 && i10 == 0) {
                    return schemeData2;
                }
                if (i13 >= 23 && i10 == 1) {
                    return schemeData2;
                }
            }
        }
        return (DrmInitData.SchemeData) arrayList.get(0);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID uuid, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance = newFrameworkInstance(uuid, mediaDrmCallback, hashMap);
        if (handler != null && defaultDrmSessionEventListener != null) {
            newFrameworkInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return newFrameworkInstance;
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback mediaDrmCallback, String str, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance = newPlayReadyInstance(mediaDrmCallback, str);
        if (handler != null && defaultDrmSessionEventListener != null) {
            newPlayReadyInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return newPlayReadyInstance;
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) throws UnsupportedDrmException {
        DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance = newWidevineInstance(mediaDrmCallback, hashMap);
        if (handler != null && defaultDrmSessionEventListener != null) {
            newWidevineInstance.addListener(handler, defaultDrmSessionEventListener);
        }
        return newWidevineInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSessionManager$1] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSession<T extends com.mbridge.msdk.playercommon.exoplayer2.drm.ExoMediaCrypto>, com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager
    public DrmSession<T> acquireSession(Looper looper, DrmInitData drmInitData) {
        boolean z10;
        DrmInitData.SchemeData schemeData;
        byte[] bArr;
        Looper looper2 = this.playbackLooper;
        if (looper2 != null && looper2 != looper) {
            z10 = false;
        } else {
            z10 = true;
        }
        Assertions.checkState(z10);
        if (this.sessions.isEmpty()) {
            this.playbackLooper = looper;
            if (this.mediaDrmHandler == null) {
                this.mediaDrmHandler = new MediaDrmHandler(looper);
            }
        }
        DefaultDrmSession<T> defaultDrmSession = 0;
        defaultDrmSession = 0;
        if (this.offlineLicenseKeySetId == null) {
            DrmInitData.SchemeData schemeData2 = getSchemeData(drmInitData, this.uuid, false);
            if (schemeData2 == null) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.uuid);
                this.eventDispatcher.drmSessionManagerError(missingSchemeDataException);
                return new ErrorStateDrmSession(new DrmSession.DrmSessionException(missingSchemeDataException));
            }
            schemeData = schemeData2;
        } else {
            schemeData = null;
        }
        if (!this.multiSession) {
            if (!this.sessions.isEmpty()) {
                defaultDrmSession = this.sessions.get(0);
            }
        } else {
            if (schemeData != null) {
                bArr = schemeData.data;
            } else {
                bArr = null;
            }
            Iterator<DefaultDrmSession<T>> it = this.sessions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession<T> next = it.next();
                if (next.hasInitData(bArr)) {
                    defaultDrmSession = next;
                    break;
                }
            }
        }
        if (defaultDrmSession == 0) {
            DefaultDrmSession<T> defaultDrmSession2 = new DefaultDrmSession<>(this.uuid, this.mediaDrm, this, schemeData, this.mode, this.offlineLicenseKeySetId, this.optionalKeyRequestParameters, this.callback, looper, this.eventDispatcher, this.initialDrmRequestRetryCount);
            this.sessions.add(defaultDrmSession2);
            defaultDrmSession = defaultDrmSession2;
        }
        ((DefaultDrmSession) defaultDrmSession).acquire();
        return (DrmSession<T>) defaultDrmSession;
    }

    public final void addListener(Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.eventDispatcher.addListener(handler, defaultDrmSessionEventListener);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager
    public boolean canAcquireSession(DrmInitData drmInitData) {
        if (this.offlineLicenseKeySetId != null) {
            return true;
        }
        if (getSchemeData(drmInitData, this.uuid, true) == null) {
            if (drmInitData.schemeDataCount != 1 || !drmInitData.get(0).matches(C.COMMON_PSSH_UUID)) {
                return false;
            }
            Log.w(TAG, "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.uuid);
        }
        String str = drmInitData.schemeType;
        if (str == null || C.CENC_TYPE_cenc.equals(str)) {
            return true;
        }
        if ((!C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cbcs.equals(str) && !C.CENC_TYPE_cens.equals(str)) || Util.SDK_INT >= 25) {
            return true;
        }
        return false;
    }

    public final byte[] getPropertyByteArray(String str) {
        return this.mediaDrm.getPropertyByteArray(str);
    }

    public final String getPropertyString(String str) {
        return this.mediaDrm.getPropertyString(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
    public void onProvisionCompleted() {
        Iterator<DefaultDrmSession<T>> it = this.provisioningSessions.iterator();
        while (it.hasNext()) {
            it.next().onProvisionCompleted();
        }
        this.provisioningSessions.clear();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
    public void onProvisionError(Exception exc) {
        Iterator<DefaultDrmSession<T>> it = this.provisioningSessions.iterator();
        while (it.hasNext()) {
            it.next().onProvisionError(exc);
        }
        this.provisioningSessions.clear();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DefaultDrmSession.ProvisioningManager
    public void provisionRequired(DefaultDrmSession<T> defaultDrmSession) {
        this.provisioningSessions.add(defaultDrmSession);
        if (this.provisioningSessions.size() == 1) {
            defaultDrmSession.provision();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.drm.DrmSessionManager
    public void releaseSession(DrmSession<T> drmSession) {
        if (drmSession instanceof ErrorStateDrmSession) {
            return;
        }
        DefaultDrmSession<T> defaultDrmSession = (DefaultDrmSession) drmSession;
        if (defaultDrmSession.release()) {
            this.sessions.remove(defaultDrmSession);
            if (this.provisioningSessions.size() > 1 && this.provisioningSessions.get(0) == defaultDrmSession) {
                this.provisioningSessions.get(1).provision();
            }
            this.provisioningSessions.remove(defaultDrmSession);
        }
    }

    public final void removeListener(DefaultDrmSessionEventListener defaultDrmSessionEventListener) {
        this.eventDispatcher.removeListener(defaultDrmSessionEventListener);
    }

    public void setMode(int i10, byte[] bArr) {
        Assertions.checkState(this.sessions.isEmpty());
        if (i10 == 1 || i10 == 3) {
            Assertions.checkNotNull(bArr);
        }
        this.mode = i10;
        this.offlineLicenseKeySetId = bArr;
    }

    public final void setPropertyByteArray(String str, byte[] bArr) {
        this.mediaDrm.setPropertyByteArray(str, bArr);
    }

    public final void setPropertyString(String str, String str2) {
        this.mediaDrm.setPropertyString(str, str2);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) {
        this(uuid, (ExoMediaDrm) exoMediaDrm, mediaDrmCallback, hashMap, false, 3);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newFrameworkInstance(UUID uuid, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) throws UnsupportedDrmException {
        return new DefaultDrmSessionManager<>(uuid, (ExoMediaDrm) FrameworkMediaDrm.newInstance(uuid), mediaDrmCallback, hashMap, false, 3);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newPlayReadyInstance(MediaDrmCallback mediaDrmCallback, String str) throws UnsupportedDrmException {
        return newFrameworkInstance(C.PLAYREADY_UUID, mediaDrmCallback, !TextUtils.isEmpty(str) ? j.q(PLAYREADY_CUSTOM_DATA_KEY, str) : null);
    }

    public static DefaultDrmSessionManager<FrameworkMediaCrypto> newWidevineInstance(MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap) throws UnsupportedDrmException {
        return newFrameworkInstance(C.WIDEVINE_UUID, mediaDrmCallback, hashMap);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener, boolean z10) {
        this(uuid, exoMediaDrm, mediaDrmCallback, hashMap, z10);
        if (handler == null || defaultDrmSessionEventListener == null) {
            return;
        }
        addListener(handler, defaultDrmSessionEventListener);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z10) {
        this(uuid, exoMediaDrm, mediaDrmCallback, hashMap, z10, 3);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, Handler handler, DefaultDrmSessionEventListener defaultDrmSessionEventListener, boolean z10, int i10) {
        this(uuid, exoMediaDrm, mediaDrmCallback, hashMap, z10, i10);
        if (handler == null || defaultDrmSessionEventListener == null) {
            return;
        }
        addListener(handler, defaultDrmSessionEventListener);
    }

    public DefaultDrmSessionManager(UUID uuid, ExoMediaDrm<T> exoMediaDrm, MediaDrmCallback mediaDrmCallback, HashMap<String, String> hashMap, boolean z10, int i10) {
        Assertions.checkNotNull(uuid);
        Assertions.checkNotNull(exoMediaDrm);
        Assertions.checkArgument(!C.COMMON_PSSH_UUID.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.uuid = uuid;
        this.mediaDrm = exoMediaDrm;
        this.callback = mediaDrmCallback;
        this.optionalKeyRequestParameters = hashMap;
        this.eventDispatcher = new DefaultDrmSessionEventListener.EventDispatcher();
        this.multiSession = z10;
        this.initialDrmRequestRetryCount = i10;
        this.mode = 0;
        this.sessions = new ArrayList();
        this.provisioningSessions = new ArrayList();
        if (z10) {
            exoMediaDrm.setPropertyString("sessionSharing", "enable");
        }
        exoMediaDrm.setOnEventListener(new MediaDrmEventListener());
    }
}
