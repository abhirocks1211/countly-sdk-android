package ly.count.sdk.java.internal;

import ly.count.sdk.ConfigCore;
import ly.count.sdk.internal.CtxCore;
import ly.count.sdk.internal.DeviceIdGenerator;
import ly.count.sdk.internal.Log;
import ly.count.sdk.internal.ModuleDeviceIdCore;
import ly.count.sdk.internal.Utils;
import ly.count.sdk.java.Config;

public class ModuleDeviceId extends ModuleDeviceIdCore {
    private static final Log.Module L = Log.module("ModuleDeviceId");

    static {

    }

    /**
     * Overriding core logic to reuse legacy id.
     *
     * @param ctx Ctx
     */
    @Override
    public void onContextAcquired(final CtxCore ctx) {
        if (ctx.getConfig().getDeviceId() == null) {
            // fresh install
        }

        super.onContextAcquired(ctx);
    }
}