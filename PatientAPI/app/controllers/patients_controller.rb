class PatientsController < ActionController::API

	def details
	p=Patient.new
    p.pid=params["pid"]
    p.name=params["name"]
    p.phone=params["phone"]
    p.weeks=params["weeks"]
    p.age=params["age"]
    p.weight=params["weight"]
    p.address=params["address"]
    p.aadhar=params["aadhar"]
    p.latitude=params["latitude"].to_f
    p.longitude=params["longitude"].to_f
    p.save
  	data={}
    data["message"]="Patient bana diya addie mc"
    render json:data
	end

	def neighbours
		latitude=params["latitude"].to_f
		longitude=params["longitude"].to_f
		# puts longitude
		p=Patient.all
		name=''
		weks=''
		lat=''
		long=''
		p.each do |patient|
			latdif=patient.latitude-latitude
			longdif=patient.longitude-longitude
		    if(latdif<=0.05 && latdif>=-0.05 && longdif<=0.05 && longdif>=-0.05)
			    name=name+patient.name+' '
			    # byebug
			    weks=weks+patient.weeks.to_s+' '
			    lat=lat+patient.latitude.to_s+' '
			    long=long+patient.longitude.to_s+' '
		     end
		end
		name=name+' '
		weks=weks+' '
		lat=lat+' '
		long=long+' '
		# byebug
		# puts name
		data={}
		data["message"]="Patient bana diya addie mc"
		data['name']=name
		data['week']=weks
		data['latitude']=lat
		data['longitude']=long
        render json:data
	end



end
