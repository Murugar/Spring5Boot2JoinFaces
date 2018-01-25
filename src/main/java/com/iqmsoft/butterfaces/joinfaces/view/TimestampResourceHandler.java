package com.iqmsoft.butterfaces.joinfaces.view;

import de.larmic.butterfaces.handler.ButterFacesResource;
import javax.faces.application.Resource;
import javax.faces.application.ResourceHandler;
import javax.faces.application.ResourceHandlerWrapper;


public class TimestampResourceHandler extends ResourceHandlerWrapper {

    private final ResourceHandler wrapped;

    public TimestampResourceHandler(ResourceHandler wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public ResourceHandler getWrapped() {
        return this.wrapped;
    }

    @Override
    public Resource createResource(String resourceName, String libraryName) {
        final Resource resource = super.createResource(resourceName, libraryName);
        return new ButterFacesResource(resource);
    }
}