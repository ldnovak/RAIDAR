package edu.mit.cxsci.raidar.asset.model;

import com.google.gson.Gson;
import org.springframework.data.annotation.Id;

import java.net.URI;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class BaseAsset implements Asset {

    // Unique (to this instance) ID
    @Id
    private String id;

    // Title of the asset
    private String title;

    // TODO: Better name for the creation of the 'Asset' document, rather than say, the recording
    private LocalDateTime createDateTime;


    // TODO: Make creators/contributors be objects rather than strings?
    // Who created this
    private String creatorId;
    // who contributed to the asset.
    private List<String> contributors;

    // sources are links to the actual asset (I.E. music recording, etc.)
    private List<URI> sources;

    public BaseAsset(){
        this.title = "";
        this.createDateTime = LocalDateTime.now();
        this.creatorId = "";
        this.sources = new ArrayList<>();
        this.contributors = new ArrayList<>();
    }

    public void addSource(URI source){
        if(!sources.contains(source)){
            sources.add(source);
        }
    }

    public List<URI> getSoruces(){
        return sources;
    }

    public void addContributor(String contributor){
        if (!this.contributors.contains(contributor)){
            this.contributors.add(contributor);
        }
    }

    public List<String> getContributors(){
        return contributors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getCreateDateTime() {
        return createDateTime;
    }

    public void setCreateDateTime(LocalDateTime createDateTime) {
        this.createDateTime = createDateTime;
    }

    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public String toJson(){
        return new Gson().toJson(this);
    }
}
